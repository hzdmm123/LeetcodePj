package Interview;

import java.util.Stack;

/**
 * 两个队列实现一个栈
 * Created by hzdmm on 2017/9/19.
 */
public class TwoStackImpAQuene {
    public Stack<Integer> s1;
    public Stack<Integer> s2;

    public void add(int num){
        s1.push(num);
    }

    public int size(){
        return s1.size()+s2.size();
    }

    public int pop() throws Exception{
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()){
            throw  new Exception("队列为空");
        }

        return s2.pop();
    }
}
