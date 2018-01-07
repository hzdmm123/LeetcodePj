package swordoffer.P_2017_12_3;

import java.util.Stack;

/**
 * Created by hzdmm on 2017/12/3.
 */
public class twoStackImpQuene {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int n){
        stack1.push(n);
    }

    public int pop(){
        if (stack1.isEmpty()&&stack2.isEmpty()){
            throw  new RuntimeException("empty");
        }else if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();

    }
}
