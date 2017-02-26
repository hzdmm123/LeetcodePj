import java.util.Stack;

/**
 * Created by hzdmm on 2016/9/28.
 */
public class Problem_U1_03_Stack2ReversStack {
    public static int getAndRemoveLastElement(Stack<Integer> stack){
        int result = stack.pop();
        if (stack.isEmpty()){
            return result;
        }else{
            int last= getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(4);
        Problem_U1_03_Stack2ReversStack.reverse(stack);
        System.out.print(stack.toString());


    }
}
