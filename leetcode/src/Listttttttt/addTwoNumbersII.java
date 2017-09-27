package Listttttttt;

import java.util.Stack;

/**
 * Created by hzdmm on 2017/9/27.
 * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 8 -> 0 -> 7
 反转  相加   再反转
 */
public class addTwoNumbersII {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();

        while (l1!=null){
            s1.push(l1.val);
            l1= l1.next;
        }

        while (l2!=null){
            s2.push(l2.val);
            l2= l2.next;
        }

        int sum = 0;
        ListNode head = new ListNode(0);
        while (!s1.isEmpty()||!s2.isEmpty()){
            if (!s1.isEmpty()) sum+=s1.pop();
            if (!s2.isEmpty()) sum+=s2.pop();
            ListNode cur = new ListNode(sum%10);
            cur.next = head.next;
            head.next=cur;
            sum /=10;
        }

        if (sum !=0){
            ListNode cur = new ListNode(1);
            cur.next = head.next;
            head.next = cur;
        }

        return head.next;

    }
}
