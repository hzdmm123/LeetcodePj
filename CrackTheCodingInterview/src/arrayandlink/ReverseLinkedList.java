package arrayandlink;

/**反转一个单链表
 * Created by hzdmm on 2017/3/6.
 */
public class ReverseLinkedList {
    public static class Node{
        public Node next;
        public int value;
        public Node(int value){
            this.value=value;
        }
    }
    public static Node Reverse(Node head){
        Node next=null;
        Node pre=null;
        while (head!=null){
            next= head.next;
            head.next=pre;
            pre = head;
            head=next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(1);
        a.next=b;
        b.next=c;
        System.out.println(Reverse(a).value);
    }
}
