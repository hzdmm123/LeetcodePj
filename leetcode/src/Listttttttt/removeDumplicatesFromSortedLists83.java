package Listttttttt;

/**
 * Created by hzdmm on 2017/9/28.
 */
public class removeDumplicatesFromSortedLists83 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur !=null && cur.next!=null){
            if (cur.next.val==cur.val){
                cur.next=cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}
