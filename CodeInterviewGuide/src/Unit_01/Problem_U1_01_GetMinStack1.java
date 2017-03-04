package Unit_01;

import java.util.Stack;

/**
 * Created by hzdmm on 2016/9/25.
 */
public class Problem_U1_01_GetMinStack1 {
public static  class MyStack1 {
    /*   private Stack<Integer> stackData;
       private Stack<Integer> stackMin;
       public MyStack1(){
           this.stackData = new Stack<Integer>();
           this.stackMin = new Stack<Integer>();
       }
       public void push(int newNum){
           if (this.stackData.isEmpty()){
               this.stackData.push(newNum);
           }else if (newNum <= this.getMin()){6
               this.stackMin.push(newNum);
           }
           this.stackData.push(newNum);
       }
       public int pop(){
           if (this.stackData.isEmpty()){
               throw new RuntimeException();
           }
           int value = this.stackData.pop();
           if (value == this.getMin()){
               this.stackData.pop();
           }
           return value;

       }
       public int getMin(){
           if (this.stackMin.isEmpty()){
               throw new RuntimeException("empty");
           }
           return this.stackMin.peek();
       }

   }
       public static void main(String[] args){
           MyStack1 ms= new MyStack1();
           ms.push(3);
           System.out.print(ms.getMin());
       }*/
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(newNum);
        } else if (newNum <= this.getmin()) {
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        int value = this.stackData.pop();
        if (value == this.getmin()) {
            this.stackMin.pop();
        }
        return value;
    }

    public int getmin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }



    }
    public static void main(String[] args) {
        MyStack1 ms = new MyStack1();
        ms.push(3);
        ms.push(1);
        System.out.print(ms.getmin());
    }
}