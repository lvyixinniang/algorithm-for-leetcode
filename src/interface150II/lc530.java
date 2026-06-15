package interface150II;

import java.util.*;

public class lc530 {

      public class TreeNode {
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

  private int minn = Integer.MAX_VALUE;
      private int prev = -1;

  public int getMinimumDifference(TreeNode root) {
      // dfs, 这是二叉搜索树
      dfs(root);
      return minn;
  }

  private void dfs(TreeNode root) {
      if (root == null) return;

      dfs(root.left);
      if (prev != -1) {
          minn = Math.min(minn, root.val - prev);
      }
      prev = root.val;
      dfs(root.right);
  }

}
