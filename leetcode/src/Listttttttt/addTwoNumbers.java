package Listttttttt;

/**
 * Created by hzdmm on 2017/9/26.
 * You are given two non-empty linked lists representing two non-negative integers.
 * ]The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class addTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode test = new ListNode(-1);
        ListNode cur = test;
        int carry =0;
        while (l1!=null||l2!=null){
            int d1=l1 == null?0:l1.val;
            int d2=l2 == null?0:l2.val;
            int sum = d1+d2+carry;
            carry = sum>=10?1:0;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            if (l1!=null){
                l1=l1.next;
            }
            if (l2!=null){
                l2=l2.next;
            }

        }
        if (carry==1) cur.next= new ListNode(1);//最后一个值肯定是1或者0
        return test.next;
    }
}
