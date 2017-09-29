package Listttttttt;

/**
 * Created by hzdmm on 2017/9/29.
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * Follow up:
 * Can you solve it without using extra space?
 * 判断一个链表里面是否有环
 */
public class LinkedListCycle_141 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode fast = head;
        ListNode slow =head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                return true;
            }
        }
        return false;
    }

}
