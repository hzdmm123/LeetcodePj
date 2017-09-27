import java.util.LinkedList;

/**
 * Created by hzdmm on 2017/3/24.
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class NoDumplicateNode {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication1(ListNode pHead) {
        ListNode first = new ListNode(-1);
        first.next = pHead;
        ListNode last = first;
        ListNode p = pHead;

        while(p!=null&&p.next!=null){
            if(p.val==p.next.val){
                int val = p.val;
                while(p!=null&&p.val==val){
                    p = p.next;
                    last.next = p;
                }
            }else{
                last = p;
                p = p.next;
            }
        }

        return first.next;
    }

    public ListNode deleteDuplication2(ListNode pHead){
        if (pHead==null||pHead.next==null){
            return null;
        }

        ListNode cur = pHead;
        ListNode lnode = null;
        ListNode first = null;
        first.next=pHead;
        lnode=first;
        while (cur.next!=null){//当前节点不为空
            if (cur.val==cur.next.val){
                int val = cur.val;
                while (cur!=null&&cur.val==val) {//如果值相等就一直找到那个不等的
                    cur = cur.next;
                }

            }else {
                lnode=cur;
                cur = cur.next;
            }
        }
        return first.next;
/*        Integer.valueOf()
        java.util.concurrent.atomic.AtomicInteger*/
    }

}
