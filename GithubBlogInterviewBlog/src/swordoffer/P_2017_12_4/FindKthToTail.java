package swordoffer.P_2017_12_4;

/**
 * Created by hzdmm on 2017/12/4.
 */

public class FindKthToTail {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        //双节点的问题，一个节点先走k，那么就能保证先走的比后走的大k
        if (head==null||k<1){
            return null;
        }
        ListNode pre = head;
        for (int i=1;i<k;i++){
            if (pre.next!=null){
                pre = pre.next;
            }else {
                return null;
            }
        }

        while (pre.next!=null){
            head = head.next;
            pre = pre.next;
        }

        return head;
    }
}
