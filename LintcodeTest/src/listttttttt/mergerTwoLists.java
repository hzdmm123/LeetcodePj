package listttttttt;

/**
 * Created by hzdmm on 2017/10/10.
 */
public class mergerTwoLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode fakeHead = new ListNode(-1);
        ListNode newHead = fakeHead;
        if (l1==null) return l2;
        if (l2==null) return l1;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                newHead.next = l1;
                l1=l1.next;
            }else {
                newHead.next=l2;
                l2=l2.next;

            }
            newHead=newHead.next;
        }
        while (l1!=null){
            newHead.next=l1;
        }

        while (l2!=null){
            newHead.next=l2;
        }
        return fakeHead.next;
    }
}
