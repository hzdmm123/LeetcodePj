package listttttttt;

/**
 * Created by hzdmm on 2017/9/26.
 */

/**
 * Definition for ListNode.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int val) {
 * this.val = val;
 * this.next = null;
 * }
 * }
 */


public class reverseList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /*
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        ListNode next = null;
        ListNode pre = null;
        while (head!=null){
            next = head.next;
            head.next=pre;
            pre = head;
            head = next;
        }
        return pre;


    }
}