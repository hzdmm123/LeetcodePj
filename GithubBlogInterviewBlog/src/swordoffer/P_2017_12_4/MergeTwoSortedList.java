package swordoffer.P_2017_12_4;

/**
 * Created by hzdmm on 2017/12/4.
 */
public class MergeTwoSortedList {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode merger(ListNode l1,ListNode l2){
        ListNode head = new ListNode(-1);
        head.next = null;
        ListNode root = head;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                head.next = l1;
                head = l1;
                l1 = l1.next;
            }else {
                head.next = l2;
                head = l2;
                l2 = l2.next;
            }
        }

        if (l1!=null){
            head.next = l1;
            l1 = l1.next;
        }

        if (l2!=null){
            head.next = l2;
            l2 = l2.next;
        }

        return root.next;
    }
}
