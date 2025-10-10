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
        return Builder(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode Builder(int[] preorder, int[] inorder, int pre_left, int pre_right, int in_left, int in_right) {
      if (pre_left > pre_right || in_left > in_right) return null;

      TreeNode root =  new TreeNode(preorder[pre_left]);
        int root_val = preorder[pre_left];
//        查询，root——val在中序的位置
        int root_index = in_left;
        for (int i = in_left; i <= in_right; i++) {
            if (inorder[i] == root_val) {
                root_index = i;
                break;
            }
        }

        int len = root_index - in_left; // 左树长度
        root.left = Builder(preorder, inorder, pre_left + 1, pre_left+len, in_left, root_index -1);
        root.right = Builder(preorder, inorder, pre_left+ len + 1, pre_right, root_index+1, in_right);
        return root;
    }
}
