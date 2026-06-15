package interface150II;

public class lc105 {
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        return build(preorder, inorder, 0, len - 1, 0, len - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int pre_left, int pre_right, int in_left, int in_right) {
      if (pre_left > pre_right || in_left > in_right) return null;

      TreeNode root = new TreeNode(preorder[pre_left]);

      int root_val = preorder[pre_left];
      int in_index = -1;
        for (int i = in_left; i <= in_right; i++) {
            if (inorder[i] == root_val) {
                in_index = i;
                break;
            }
        }

        int leftTreeSize = in_index - in_left;

        root.left = build(preorder, inorder
                , pre_left + 1, pre_left + leftTreeSize
                , in_left, in_index - 1);
        root.right = build(preorder, inorder,
                pre_left+ leftTreeSize + 1, pre_right,
                in_index + 1, in_right);

        return root;
    }
}
