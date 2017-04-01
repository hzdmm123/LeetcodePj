import java.util.Stack;

/**
 * Created by hzdmm on 2017/3/9.
 */
public class PrintNodeFromNailTOHead_05 {
    public static class Node{
        Node next;
        int val;
        public Node(int val){
            this.val=val;
        }

    }
    public static void print(Node head){

/*        if (head!=null){
            head=head.next;
            if (head.next!=null){

                print(head.next);

            }
            System.out.println(head.val);
        }*/
        if (head==null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        while (head!=null){
            stack.push(head);
            head=head.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop().val);
        }

    }

    public static void print2(Node head){
        if (head!=null){
            if (head.next!=null){
                print2(head.next);
            }
            System.out.println(head.val);
        }

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next=b;
        b.next=c;
        print2(a);

    }
}
