import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by hzdmm on 2017/2/13.    p129
 * 题目描述：二叉树按照层次打印，并且按照2叉树的层次打印出来(关键在于last和nlast的理解变化)
 */
public class BinaryTreePrintAsLevel {
    public static class Node{
        public int val;
        public Node left;
        public Node right;
        public Node(int val){
            this.val=val;
        }
    }

    public void BinaryTreePrintAsLevel(Node head){
        if (head==null){
            return;
        }

        Queue<Node> quene = new LinkedList<>();
        int level = 1;
        Node Last = head;
        Node nlast = null;
        Node cur= null;
        quene.offer(head);
        System.out.println("Level "+(level++)+" : ");
        while(!quene.isEmpty()){
            cur = quene.poll();
            System.out.print(head.val+" ");
            if (cur.left!=null){
                quene.offer(cur.left);
                nlast=cur.left;
            }
            if (cur.right!=null){
                quene.offer(cur.right);
                nlast = cur.right;
            }
            if (cur == Last &&!quene.isEmpty()){
                System.out.print("\nLevel"+(level++)+" :");
                Last = nlast;
            }
        }

        System.out.println();
    }
}
