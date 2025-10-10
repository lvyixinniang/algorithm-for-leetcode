package interface150II;

import java.util.Stack;

public class lc236 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
//  todo 做不来， 感觉还查了点什么 8/30日重做（不会）
  // 标准递归
      public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) return null;
            if (root == p || root == q) return root;
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left != null && right != null) return root;

            if (left != null) return left;
            if (right != null) return right;

            return null;
      }
}
