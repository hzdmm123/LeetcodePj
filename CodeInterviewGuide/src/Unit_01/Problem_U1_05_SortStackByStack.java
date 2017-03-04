package Unit_01;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by hzdmm on 2016/9/29.
 */
public class Problem_U1_05_SortStackByStack {
    public static void sortStackByStack(Stack<Integer> stack){
        Stack<Integer> help = new Stack<>();
        while(!stack.isEmpty()){
            int cur = stack.pop();
            while(!help.isEmpty()&& help.peek()<cur){
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while(!help.isEmpty()){
            stack.push(help.pop());
        }

    }
    public static void main(String[] args){
        Stack<Integer>  st= new Stack<>();

        st.push(4);
        st.push(5);
        st.push(1);
        st.push(3);
        st.push(2);
        Problem_U1_05_SortStackByStack.sortStackByStack(st);
        System.out.println(Arrays.toString(st.toArray()));

    }
}
