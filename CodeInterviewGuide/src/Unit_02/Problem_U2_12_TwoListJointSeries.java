package Unit_02;

/**
 * Created by hzdmm on 2017/3/7.
 */
public class Problem_U2_12_TwoListJointSeries {
    public class Node{
        Node next;
        private int value;
        public Node(int value){
            this.value=value;
        }
    }

    /**
     * 查找一个链表的是否有环，如果有就返回链表的头结点
     * @param head
     * @return
     */
    public static Node getLoopNode(Node head){
        if (head==null||head.next==null||head.next.next==null){
            return null;
        }

        Node slow=head.next;
        Node fast=head.next.next;
        while (fast!=slow){//找到在环中的相遇的节点
            if (fast==null||slow==null){
                return null;
            }
            fast=fast.next.next;
            slow=slow.next;
        }
        fast=head;//fast回到头结点，和slow相同速度走
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;//相遇的地方就是环的入口
    }

    /**
     * 判断两个无环链表是否相交，如果相交就返回相交点
     * 关键点在于链表相交就一直相交
     */
    public static Node getJointPoint(Node head1,Node head2){
        if(head1==null||head2==null){
            return null;
        }

        Node cur1=head1;
        Node cur2=head2;
        int n=0;
        while (cur1.next!=null){
            cur1=cur1.next;
            n++;
        }
        int len2=0;
        while (cur2.next!=null){
            cur2=cur2.next;
            n--;
        }

        if (cur1!=cur2){//如果最后一个节点
            return null;
        }
        cur1= n>0?head1:head2;
        cur2=cur1==head1?head2:head1;
        while (n!=0){
            cur1=cur1.next;//如果大于0的话就先走n步
            n--;
        }

        while (cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }

    /**
     * 如何判断两个有环链表是否相交
     */
}
