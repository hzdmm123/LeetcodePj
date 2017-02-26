import java.util.Stack;

/**
 * Created by hzdmm on 2016/9/26.
 */
public class Problem_U1_01_GetMinStack2 {
    public static class MyStack2{
        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;

        public MyStack2() {
            this.stackData = new Stack<Integer>();
            this.stackMin = new Stack<Integer>();
        }
        public void push(int newNum){
            if(this.stackMin.isEmpty()){
                this.stackMin.push(newNum);
            }else if (newNum<this.getMin()){
                this.stackMin.push(newNum);
            }else{
                int newMin = this.stackMin.peek();
                this.stackMin.push(newMin);
            }
            this.stackData.push(newNum);

        }
        public int pop(){
            if (this.stackData.isEmpty()){
                throw new RuntimeException("empty");
            }
            this.stackMin.pop();
            return this.stackData.pop();
        }
        public int getMin(){
            if (this.stackMin.isEmpty()){
                throw new RuntimeException("empty");
            }
            return this.stackMin.peek();
        }
    }
    public static void main(String[] args){
        MyStack2 ms2= new MyStack2();
        ms2.push(4);
        ms2.push(3);
        ms2.push(2);
        ms2.push(7);
        System.out.println(ms2.pop());
        System.out.println(ms2.pop());
        System.out.println(ms2.getMin());


    }
}
