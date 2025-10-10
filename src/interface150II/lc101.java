package interface150II;

import java.util.*;

public class lc101 {

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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;

        return isMirror(left.left, right.right) && isMirror(right.left, left.right);
   }

    public static void main(String[] args) {
//          TreeNode root = new TreeNode(1 ,new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        TreeNode root = new TreeNode(1,new TreeNode(0), null);
        lc101 solution = new lc101();
        System.out.println(solution.isSymmetric(root));
      }
}
