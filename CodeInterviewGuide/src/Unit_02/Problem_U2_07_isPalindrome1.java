package Unit_02;

import java.util.Stack;

/**判断一个链表是不是回文结构
 * Created by hzdmm on 2017/3/4.
 */
public class Problem_U2_07_isPalindrome1 {
    public class Node{
        public int value;
        public Node next;
        public Node(int value){
            this.value=value;
        }
    }//创建链表的数据结构
    //利用一个完整的栈来反转字符串然后相比较
    public boolean isPalindrome1(Node head){
        Stack<Node> tem = new Stack<>();
        Node  root = head;
        while (head!=null){
            tem.push(head);
            head = head.next;
        }//存到栈里面

        while (root.next!=null && !tem.isEmpty()){
            if (root.value!=tem.pop().value){
                return false;
            }
            root=root.next;
        }
        return true;
    }


    public boolean isPalindrome2(Node head){
        return false;

    }


}
