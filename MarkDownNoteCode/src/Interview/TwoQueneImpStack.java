package Interview;

import java.util.LinkedList;

/**
 * Created by hzdmm on 2017/9/19.
 */
public class TwoQueneImpStack {
    LinkedList<Integer> queue1 = new LinkedList();
    LinkedList<Integer> queue2 = new LinkedList();

    public void push(int value){
        queue1.addLast(value);
    }

    public int size(){
        return queue1.size()+queue2.size();
    }

    public int pop() throws Exception{
        if (size()!=0){
            if (!queue1.isEmpty()){
                putOneToAnother();//q1的值只留一个其余放到空的q2中
                return queue1.removeFirst();
            }
            if (!queue2.isEmpty()){
                putOneToAnother();//q2的值只留一个其余放到空的q1中
                return queue2.removeFirst();
            }
        }
        throw new Exception("空了");
    }


    public void putOneToAnother(){
        if (!queue1.isEmpty()){
            while (queue1.size()>1){
                queue2.addLast(queue1.removeFirst());
            }
        }else if (!queue2.isEmpty()){
            while (queue2.size()>1){
                queue1.addLast(queue2.removeFirst());
            }
        }
    }
}
