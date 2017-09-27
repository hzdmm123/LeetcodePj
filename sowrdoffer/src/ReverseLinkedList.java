/**
 * Created by hzdmm on 2017/8/22.
 * 题目描述
 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class ReverseLinkedList {
    public static class Node{
        int value;
        Node next = null;
        Node(int value){
            this.value=value;
        }
    }

    public static Node reverseList(Node head){
        if (head==null){
            return head;
        }
        Node cur = head;//当前指针
        Node pre = null;
        Node reverseHead = null;//新链表的头指针
        while (cur!=null){
            Node next = cur.next;
            if (reverseHead==null){
                reverseHead = cur;//保存最后一个节点就是要逆置之后返回的第一个节点
            }
            cur.next = pre;//这里做反转逆置 第二轮在这边做逆置
            pre = cur;//下一轮
            cur = next;
        }
        return reverseHead;
    }

    public static Node reverseListRescur(Node head){
        if (head==null||head.next==null){
            return head;
        }

        Node reverseNode = reverseListRescur(head.next);

        head.next.next=head;
        head.next=null;
        return reverseNode;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next= b;
        b.next = c;
        reverseList(a);
    }
}
