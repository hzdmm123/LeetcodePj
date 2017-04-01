import java.util.Stack;

/**
 * Created by hzdmm on 2017/3/14.
 */
public class IsPopOrder {
    public static boolean IsPopOrder(int[] pushA,int[] popA){
        if (pushA==null||popA==null){
            return false;
        }
        Stack<Integer> push = new Stack<Integer>();
        int pushIndex=0;
        int popIndex=0;
        while (popIndex<popA.length){
            while ( push.isEmpty() || push.peek() != popA[popIndex]){
                push.push(pushA[pushIndex]);
                pushIndex++;
            }

            if (push.peek()==popA[popIndex]){
                push.pop();
                popIndex++;
            }else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] pushA={1,2,3,4,5};
        int[] popA={4,3,5,1,2};
        System.out.println(IsPopOrder(pushA,popA));
    }
}
