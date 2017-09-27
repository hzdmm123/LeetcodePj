package Listttttttt;

/**
 * Created by hzdmm on 2017/9/25.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class IntersectionofTwoLinkedLists160 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null){
            return null;
        }
        int headAlength = 0;
        ListNode nodeA = headA;
        while (nodeA.next!=null){
            headAlength++;
            nodeA=nodeA.next;
        }

        int headBlength = 0;
        ListNode nodeB = headB;
        while (nodeB.next!=null){
            headBlength++;
            nodeB=nodeB.next;
        }
        int minus = headAlength-headBlength;
        if (minus>0){
            while (minus!=0){
                nodeA=nodeA.next;
            }
        }else {
            while (minus!=0){
                nodeB=nodeB.next;
            }
        }

        while (nodeA!=nodeB){
            nodeA=nodeA.next;
            nodeB=nodeB.next;
        }
        return nodeA;
    }
}
