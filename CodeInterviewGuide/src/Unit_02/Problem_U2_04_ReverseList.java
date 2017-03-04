package Unit_02;

/**
 * Created by hzdmm on 2016/11/29.
 */
public class Problem_U2_04_ReverseList {
    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value = data;
        }

    }

    public static Node reverseList(Node head){
        Node pre = null;
        Node next = null;
        while(head != null){
            next = head.next;
            head.next=pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        System.out.println(Problem_U2_04_ReverseList.reverseList(n1).value);
    }
}
