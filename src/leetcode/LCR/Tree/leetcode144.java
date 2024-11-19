package leetcode.LCR.Tree;

public class leetcode144 {
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
    public TreeNode flipTree(TreeNode root) {
        TreeNode p = root;
        reverse (root);
        return p;
    }

    private void reverse(TreeNode root) {
      if (root == null) return;
      TreeNode temp = null;
        if (root.left != null) {
            temp = root.left;
        }
        root.left = root.right;
        root.right = temp;
        if (root.left != null) reverse(root.left);
        if (root.right != null) reverse(root.right);
    }
}
