package interface150II;

import java.util.ArrayList;
import java.util.List;

public class lc98 {
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

  private long preVal = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        return midSearch(root);
    }

    private boolean midSearch(TreeNode root) {
        if (root == null) return true;
        boolean left = midSearch(root.left);
        if (!left) return false;
        if (root.val <= preVal) return false;
        preVal = root.val;

        boolean right = midSearch(root.right);
        return right;
    }
}
