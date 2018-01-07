package swordoffer.P_2017_12_9;

/**
 * Created by hzdmm on 2017/12/9.
 */
public class ReverseList {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode next = null;
        ListNode pre = null;
        while (head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public ListNode ReverseList_II(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }

        ListNode reverseNode = ReverseList(head.next);

        head.next.next=head;
        head.next=null;
        return reverseNode;
    }
}
