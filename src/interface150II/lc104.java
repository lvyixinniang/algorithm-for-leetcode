package interface150II;

public class lc104 {

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

    public int maxDepth(TreeNode root) {
        return search(root);
    }

    private int search(TreeNode root) {
      if (root == null) return 0;
      return Math.max(search(root.left), search(root.right)) + 1;
    }
}
