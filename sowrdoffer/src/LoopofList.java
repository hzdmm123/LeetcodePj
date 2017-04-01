/**
 * Created by hzdmm on 2017/3/24.一个链表中包含环，请找出该链表的环的入口结点。
 */
public class LoopofList {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead==null||pHead.next==null) return null;
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast!=null && slow!=null){
                slow=slow.next;
                fast = fast.next.next;
            if (slow==fast){
                fast=pHead;
                while (slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }



        }
        return null;
    }
}
