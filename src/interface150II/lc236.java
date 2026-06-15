package interface150II;

import java.util.Stack;

public class lc236 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

//  todo 做不来， 感觉还查了点什么 8/30日重做（不会） 3/15 4/12
    public TreeNode lowestCommonAncestor(TreeNode root,
                                         TreeNode p, TreeNode q) {
        return dfs(root, p, q);
    }

    private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        TreeNode left = dfs(root.left, p, q);
        TreeNode right = dfs(root.right, p, q);

        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}
