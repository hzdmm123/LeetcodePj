import java.util.Stack;

/**
 * Created by hzdmm on 2016/9/26.
 */
public class Problem_U1_02_2Stack2Queue {
    public static class TwoStackQueue{
        private Stack<Integer> stackPush;
        private Stack<Integer> stackPop;
        public TwoStackQueue(){
            this.stackPush= new Stack<Integer>();
            this.stackPop = new Stack<Integer>();
        }
        public void add(int pushInt){
            stackPush.push(pushInt);
        }
        public int poll(){
            if (stackPop.isEmpty() && stackPush.isEmpty()){
                throw new RuntimeException("empty");
            }else if(stackPop.isEmpty()){
                while(!stackPush.isEmpty()){
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.pop();

        }
        public int peek(){
            if (stackPop.isEmpty()&& stackPush.isEmpty()){
                throw new RuntimeException("enpty");
            }else if (stackPop.isEmpty()){
                while(!stackPush.isEmpty()){
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.peek();
        }
    }
    public static void main(String[] args){
        TwoStackQueue tsq = new TwoStackQueue();
        tsq.add(1);
        tsq.add(5);
        System.out.println(tsq.peek());
        System.out.println(tsq.poll());
        System.out.println(tsq.peek());
        tsq.add(5);


    }
}
