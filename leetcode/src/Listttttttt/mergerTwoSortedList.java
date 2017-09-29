package Listttttttt;

/**
 * Created by hzdmm on 2017/9/28.
 */
public class mergerTwoSortedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //递归方法
        if (l1==null) return l2;
        if (l2==null) return l1;
        ListNode mergerHead;
        if (l1.val<l2.val){
            mergerHead = l1;
            mergerHead.next = mergeTwoLists(l1.next,l2);
        }else {
            mergerHead = l2;
            mergerHead.next = mergeTwoLists(l1,l1.next);
        }
        return mergerHead;
    }
    public ListNode mergeTwoListsII(ListNode l1,ListNode l2){
        if (l1==null)  return l2;
        if (l2==null) return l1;
        ListNode tempNode = new ListNode(-1);
        ListNode node = tempNode;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                node.next = l1;
                l1 = l1.next;
            }else {
                node.next=l2;
                l2=l2.next;
            }
            node = node.next;
        }
        if (l1!=null){
            node.next=l1;
        }

        if (l2!=null){
            node.next=l2;
        }
        return tempNode.next;
    }
}
