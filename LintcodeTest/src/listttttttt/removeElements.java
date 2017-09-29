package listttttttt;

/**
 * Created by hzdmm on 2017/9/28.
 * 删除链表中等于给定值val的所有节点。
 * 样例
 * 给出链表 1->2->3->3->4->5->3, 和 val = 3, 你需要返回删除3之后的链表：1->2->4->5。
 */
public class removeElements {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode  cur = head;
        ListNode pre = fakeHead;
        while (cur !=null){
            if (cur.val==val){
                pre.next = cur.next;
            }else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return fakeHead.next;

    }
}
