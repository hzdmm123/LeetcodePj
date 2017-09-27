package Listttttttt;

/**
 * Created by hzdmm on 2017/9/27.
 * Given a singly linked list,
 * determine if it is a palindrome.
 * 给定一个单链表,判断是不是一个回文
 * 基本思路:1.用栈  因为空间复杂度的要求 pass
 * 2.快慢指针  找到中间节点  反转前半部  最后判断
 */
public class PalindromeLinkedList234 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head==null){
            return true;
        }
        ListNode fast= head;
        ListNode slow= head;
        while (fast!=null&&fast.next!=null){
            fast= fast.next.next;
            slow= slow.next;//找到中间节点
        }

        if (fast!=null){
            slow=slow.next;//奇数个的链表的情况
        }

        slow= reverse(slow);//反转后半部分
        fast= head;
        while (slow!=null){
            if (fast.val!=slow.val){
                return false;
            }
            fast=fast.next;
            slow=slow.next;
        }
        return true;

    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head !=null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}
