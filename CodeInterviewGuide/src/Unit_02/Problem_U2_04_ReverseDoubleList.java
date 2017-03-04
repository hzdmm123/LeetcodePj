package Unit_02;

/**
 * Created by hzdmm on 2016/11/29.
 */
public class Problem_U2_04_ReverseDoubleList {
    public static class Node{
        public int value;
        public Node last;
        public Node next;
        public Node (int data){
            this.value = data;
        }
    }

    public static Node ReverseDoubleList(Node head){
         Node last = null;
    Node next = null;
        while (head != null){
                next = head.next;
                head.next = last;
                head.last = next;
                last = head;
                head = next;
                }//画图理解一下思维扩散一点，不能死
                return last;
                }
                }
