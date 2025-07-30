package interface150II;

public class lc226 {

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

    public TreeNode invertTree(TreeNode root) {
        reverse(root);
        return root;
    }

    private void reverse(TreeNode root) {
        if (root == null) return;

          TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        reverse(root.left);
        reverse(root.right);
    }
}
