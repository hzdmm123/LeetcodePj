package ListTTTTTTT;

/**
 * A linked list is given such that each node contains an additional random pointer
 * which could point to any node in the list or null.
 Return a deep copy of the list.
 * Created by hzdmm on 2017/9/1.
 */
public class copyRandomList {
    class RandomListNode {
        int label;
        RandomListNode next, random;
        RandomListNode(int x) { this.label = x; }
    }
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head==null){
            return null;
        }
        RandomListNode newHead = null;
        RandomListNode cHead = null;
        cHead = head;
        newHead = cHead;
        while (head.next!=null){
            cHead.next = head.next;
            cHead.random = head.random;
            cHead = cHead.next;
            head = head.next;
        }
        return newHead;
    }
}
