package swordoffer.P_2017_12_10;

import java.util.Stack;

/**
 * Created by hzdmm on 2017/12/10.
 */
public class minStack {
    public Stack<Integer> dataStack;//数据栈
    public Stack<Integer> minStack;//最小值栈


    public minStack(){
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    /**
     * 一个正常存值，一个每次都存当前最小的min或者存新的小node，不管什么样子都要存一个值。
     * @param node
     */
    public void push(int node){
        dataStack.push(node);
        if (minStack.isEmpty()){
            minStack.push(node);
        }else if(node < this.min()){
            minStack.push(node);
        }else {
            int temp = minStack.peek();//存
            minStack.push(temp);
        }
    }

    public void pop(){
        dataStack.pop();
        minStack.pop();
    }

    public int top(){
        return dataStack.peek();
    }

    public int min(){
        if (minStack.isEmpty()){
            throw new RuntimeException("empty");
        }
        return minStack.peek();
    }
}
