package interface150II;

import java.util.ArrayList;
import java.util.List;

public class lc230 {
    
    public static  class TreeNode {
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

    private static int count = 0;

    public static  int kthSmallest(TreeNode root, int k) {
        return dfs(root, k);
    }

    private static int dfs(TreeNode root, int k) {
        if (root == null) return -1;

        int leftRes = dfs(root.left, k);
        if (leftRes != -1) {
            return leftRes;
        }

        count++;
        if (count == k) {
            return root.val;
        }

        int rightRes = dfs(root.right, k);
        return rightRes;
    }

    public static void main(String[] args) {
        lc230 solution = new lc230();
        TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
        System.out.println(kthSmallest(root, 2));
    }
}
