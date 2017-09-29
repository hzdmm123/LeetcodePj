package Listttttttt;

/**
 * Created by hzdmm on 2017/9/28.
 */
public class oddEvenList328 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode oddEvenList(ListNode head) {
       if (head==null||head.next==null){
           return head;
       }
       ListNode odd = head,even = head.next,evenHead = even;
       while (even!=null&&even.next!=null){
           odd.next = even.next;
           odd = odd.next;
           even.next = odd.next;
           even = even.next;
       }
       odd.next = evenHead;
       return head;
    }
    public ListNode oddEvenList2(ListNode head) {
        if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
