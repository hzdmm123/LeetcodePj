package Listttttttt;

/**
 * Created by hzdmm on 2017/9/27.
 */
public class DeleteNodeinaLinkedList_237 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val=next.val;
        node.next=next.next;
    }

}
