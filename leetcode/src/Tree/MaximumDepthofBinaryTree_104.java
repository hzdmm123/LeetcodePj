package Tree;

/**
 * Created by hzdmm on 2017/11/6.
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the
 * longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthofBinaryTree_104 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left > right ? right + 1 : left + 1;
    }
}
