import java.util.LinkedHashSet;
import java.util.Stack;
import java.util.TreeSet;

/**
 * Created by hzdmm on 2017/3/9.
 */
public class TwoStackImpQuene {
    public static class TwoStackIQuene{
         private Stack<Integer> stackPush;
         private Stack<Integer> stackPop;
         public TwoStackIQuene(){
             this.stackPush= new Stack<>();
             this.stackPop= new Stack<>();
         }

         public void add(int val){
            stackPush.push(val);
         }

         public int poll(){
             if (stackPop.isEmpty()&&stackPush.isEmpty()){
                 throw new RuntimeException("empty");
             }else {
                 while (!stackPush.isEmpty()){
                     stackPop.push(stackPush.pop());
                 }
             }
             return stackPop.pop();

         }

        public int peek(){
            if (stackPop.isEmpty()&&stackPush.isEmpty()){
                throw new RuntimeException("empty");
            }else {
                while (!stackPush.isEmpty()){
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.peek();

        }
    }
}
