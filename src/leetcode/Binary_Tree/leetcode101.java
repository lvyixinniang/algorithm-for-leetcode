package leetcode.Binary_Tree;

import java.util.*;

public class leetcode101 {
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
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    private boolean check(TreeNode p, TreeNode q) {
      if (p == null && q == null) {
          return true;
      }
      if (p == null || q == null) {
          return false;
      }
      return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
}
