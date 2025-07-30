package interface150II;

public class lc106 {
    
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

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        if (len == 0) return null;
        return buildTwoTree(inorder, postorder, 0, len - 1, 0, len - 1);
    }

    private TreeNode buildTwoTree(int[] inorder, int[] postorder, int in_left, int in_right, int post_left, int post_right) {
        if (in_left > in_right || post_left > post_right) return null;

        TreeNode root = new TreeNode(postorder[post_right]);
        int root_index = 0;
        for (int i = in_left; i <= in_right; i++) {
            if (inorder[i] == root.val) {
                root_index = i;
                break;
            }
        }
        int len = root_index - in_left;

        root.left = buildTwoTree(inorder, postorder,
                in_left,
                root_index - 1,
                post_left,
                post_left + len - 1);

        root.right = buildTwoTree(inorder, postorder,
                root_index + 1,
                in_right,
                post_left + len,
                post_right - 1);

        return root;
    }
}
