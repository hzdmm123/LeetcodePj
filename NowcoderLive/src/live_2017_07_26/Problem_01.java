package live_2017_07_26;

import java.util.Stack;

/**逆置一个栈，不用其他的数据结构
 * Created by hzdmm on 2017/7/27.
 */
public class Problem_01 {
    public static int getAndRemoveLast(Stack<Integer> s){
        int result = s.pop();
        if (s.isEmpty()){
            return result;
        }else {
            int last = getAndRemoveLast(s);
            s.push(result);
            return last;
        }
    }


    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }else {
            int i = getAndRemoveLast(stack);
             reverse(stack);
             stack.push(i);
        }
    }

    public static void main(String[] args) {
        testGetAndRemoveLast();
    }
    public static void testGetAndRemoveLast(){
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(getAndRemoveLast(s));
    }
}
