package Unit_02;

/**
 * Created by hzdmm on 2016/12/1.
 */
public class Problem_U2_04_Josephuspro1 {
    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value = data;
        }
    }

    public static Node josephuskill(Node head,int m){
        if (head == null || head.next==head || m<1){
            return head;
        }

        Node last = head;
        while (last.next!=head){
            last = last.next;
    }

    int count = 0;
        while (head != last){
        if (++count==m){
            last.next = head.next;//断开的地方相连
            count = 0;
        }else{
            last = last.next;//继续往下面数
        }
        head = last.next;
    }
        return head;

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next=b;
        b.next=c;
        c.next = d;
        d.next=e;
        e.next=f;
        f.next=a;
        Node r = Problem_U2_04_Josephuspro1.josephuskill(a,3);
        System.out.println(r.value);





    }
}
