import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by hzdmm on 2017/4/7.
 */
public class TwoQueneImpStack {
    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();


    public void push(int para){

        if (queue1.isEmpty()&&queue2.isEmpty()){
            queue1.add(para);
        }

        if (!queue1.isEmpty()){
            queue1.add(para);
        }

        if (!queue2.isEmpty()){
            queue2.add(para);
        }
    }

    public int pop(){
        if (queue2.isEmpty()&&queue1.isEmpty()){
            try {
                throw new Exception("");
            }catch (Exception e){

            }

        }

        if (!queue1.isEmpty()){
            while (queue1.size()>1){
                queue2.add(queue1.remove());
            }
            return queue1.remove();
        }

        if (!queue2.isEmpty()){
            while (queue2.size()>1){
                queue1.add(queue2.remove());
            }
            return queue2.remove();
        }

        return 0;
    }
}
