import java.util.Stack;

/**
 * Created by hzdmm on 2017/4/16.
 *
 * 题目描述
 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。*/
public class GetMinStack {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2Min;


    public GetMinStack(){
        stack1 = new Stack<>();
        stack2Min = new Stack<>();
    }

    public void push(int node) {
        stack1.push(node);
        if (stack2Min.isEmpty()){
            stack2Min.push(node);
        }else if (node<this.min()){
            stack2Min.push(node);
        }else {
            int node1 = stack2Min.peek();
            stack2Min.push(node1);
        }
    }

    public void pop() {
        int p1=stack1.pop();
        int p2=stack2Min.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        if (stack2Min.isEmpty()){
            throw  new RuntimeException("empty");
        }
        return stack2Min.peek();
    }

    public static void main(String[] args) {
        GetMinStack s = new GetMinStack();
        s.push(3);
        s.push(1);
        s.pop();
        System.out.println(s.min());
    }

}
