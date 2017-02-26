package Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by hzdmm on 2017/2/15.
 */
public class MostFrequentSubtreeSum508 {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    /*    public int MostFrequentSubtreeSum(Node root){
            //先求所有的最大的子树和，存起来,问题转化求子树的和，某一个节点的子树和是它的左节点子树和+右节点的子树和+本身的值得
            //所以先使用中序遍历求一下
            if (root!=null){
                Stack<Node> s = new Stack<>();
                HashMap map = new HashMap();
                while (!s.isEmpty()&&root!=null){
                    if(root!=null){
                        s.push(root);
                        root = root.left;
                    }else{
                        root = s.pop();
                        System.out.println("value   +  "+root.val);
                        root = root.right;

                    }
                }
            }
            return 1;
        }

        private int middleOrder(Node node){
            if (node==null) return 0;
            int left=middleOrder()
        }*/
    Map<Integer, Integer> sumToCount;

    private int postOrder(Node root) {
        if (root == null) return 0;
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        int sum = left + right + root.val;
        int count = sumToCount.getOrDefault(sum, 0) + 1;
        sumToCount.put(sum, count);
        return 1;
    }
}
