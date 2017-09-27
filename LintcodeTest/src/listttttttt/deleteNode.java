package listttttttt;

/**
 * Created by hzdmm on 2017/9/25.
 */
public class deleteNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        node.val = temp.val;
        node.next = temp.next;
    }
}
