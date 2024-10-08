package leetcode.Binary_Tree;

public class leetcode543 {
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
  int maxL = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxL;
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;
        int l = depth(root.left);
        int r = depth(root.right);
        maxL = Math.max(maxL,l+r + 1);
        return Math.max(l, r) + 1;
    }
}
