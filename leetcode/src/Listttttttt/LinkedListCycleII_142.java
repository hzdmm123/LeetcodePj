package Listttttttt;

/**
 * Created by hzdmm on 2017/9/29.
 */
public class LinkedListCycleII_142 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        if (head==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow){//先找到相交
                fast = head;//fast重置回起点
                while (fast!=slow){//slow离相交点X 起点离交点为a
                    //slow=s 和 fast=ns a+x=s   2s=s+nr
                    fast=fast.next;
                    slow=slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
