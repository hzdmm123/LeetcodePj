package Listttttttt;

/**
 * Created by hzdmm on 2017/9/27.
 */
public class nthToLast {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode nthToLast(ListNode head, int n) {
        // write your code here
        if (head==null){
            return null;
        }
        ListNode pre = head;
        while (n>0){
            pre = pre.next;
            n--;
        }
        while (pre.next!=null){
            head= head.next;
            pre=pre.next;
        }
        return head;
    }
}
