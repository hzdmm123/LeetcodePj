/**
 * Created by hzdmm on 2016/11/29.
 */
public class Problem_U2_05_ReversePartList {
    public static class Node{
        public Node next;
        public int value;
        public Node(int data){
            this.value = data;

        }
    }

    public Node ReversePartList(Node head,int from,int to){
        int len = 0;
        Node node1 = head;
        Node fpre = null;
        Node tpos = null;
        while(node1 !=null){
            len++;
            fpre = len==from-1? node1:fpre;
            tpos = len==to+1 ? node1:tpos;
            node1 = node1.next;
        }

        if (from>to||from<1||to>len){
            return head;
        }

        node1 = fpre==null?head:fpre.next;
        Node node2 = node1.next;
        node1.next=tpos;
        Node next = null;
        while(node2 != tpos){
            next = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = next;
        }

        if (fpre!=null){
            fpre.next=node1;
            return head;
        }
        return node1;
    }
}
