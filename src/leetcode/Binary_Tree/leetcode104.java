package leetcode.Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode104 {
   public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
   public static int maxDepth(TreeNode root) {
//       DFS
/*       if (root == null) return 0;
       return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;*/

//       BFS
       if (root == null) return 0;
       Queue<TreeNode> queue = new LinkedList<>();
       queue.offer(root);
       int ans = 0;
       while (!queue.isEmpty()) {
           int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size --;
            }
            ans ++;
       }
       return ans;
   }

   public static void main(String[] args) {
        TreeNode root = new TreeNode(3, 
                new TreeNode(9), new TreeNode(20,
                new TreeNode(15),new TreeNode(7)));
       maxDepth(root);
   }
}
