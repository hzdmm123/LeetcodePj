package swordoffer.P_2017_12_11;

import java.util.Stack;

/**
 * Created by hzdmm on 2017/12/11.
 */
public class IsPopOrder {
    public boolean IsPopOrder(int [] push,int [] pop) {
        if(push==null||pop==null){
            return false;
        }

        Stack<Integer> help = new Stack<>();
        int pushIndex = 0;
        int popIndex = 0;
        while (popIndex<push.length){
            while (pushIndex<push.length&&(help.isEmpty()||help.peek()!=pop[popIndex])){
                help.push(push[pushIndex]);
                pushIndex++;
            }

            if (help.peek()==pop[popIndex]){//当stack的top和pop相同的时候stackpop出来。
                help.pop();
                popIndex++;
            }else {
                return false;
            }
        }

        return true;
    }
}
