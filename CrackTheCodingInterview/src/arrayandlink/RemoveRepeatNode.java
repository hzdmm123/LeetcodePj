package arrayandlink;

import java.util.HashSet;

/**
 * Created by hzdmm on 2017/3/6.
 */
public class RemoveRepeatNode {
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
    public static void deleteDups(Node head){
        HashSet set = new HashSet();
        Node pre = null;
        while (head!=null){
            if (set.contains(head.value)){
                head=head.next;
            }else {
                set.add(head.value);
                pre.next=head;
            }
            head=head.next;
            pre=pre.next;
        }
    }
}
