import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hzdmm on 2017/3/23.
 */
public class TreeLook {//按层次的顺序输出二叉树
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public ArrayList<Integer> TreeLook(TreeNode root) {
        Queue cur = new LinkedList();
        Queue next = new LinkedList();
        ArrayList res = new ArrayList();
        cur.offer(root);
        while (!cur.isEmpty()){
            TreeNode r = (TreeNode)cur.poll();
            res.add(r.val);
            if (r.left!=null){
                next.offer(r.left);
            }
            if (r.right!=null){
                next.offer(r.right);
            }
            if (cur.isEmpty()){
                Queue tmp = cur;
                cur = next;
                next = tmp;
            }

        }
        return  res;
    }

}
