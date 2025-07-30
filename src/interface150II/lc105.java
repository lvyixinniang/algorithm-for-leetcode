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
//  todo 做不来
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        return buildTwoTree(preorder, inorder, 0, len - 1,0 , len - 1);
    }

    private TreeNode buildTwoTree(int[] preorder, int[] inorder, int pre_left, int pre_right, int in_left, int in_right) {
      if (pre_left > pre_right || in_left > in_right) return null;
        TreeNode root = new TreeNode(preorder[pre_left]);
        int root_index = 0;
        for (int i = in_left; i <= in_right; i++) {
            if (inorder[i] == root.val) {
                root_index = i;
                break;
            }
        }
        // 计算左子树节点数（不含根节点）
        int leftSize = root_index - in_left;

        // 递归构建左子树
        root.left = buildTwoTree(preorder, inorder,
                pre_left + 1,              // 左子树前序起始：跳过根节点
                pre_left + leftSize,        // 左子树前序结束：起始 + 左子树长度
                in_left,                    // 左子树中序起始
                root_index - 1);            // 左子树中序结束

        // 递归构建右子树
        root.right = buildTwoTree(preorder, inorder,
                pre_left + leftSize + 1,   // 右子树前序起始：左子树结束 + 1
                pre_right,                 // 右子树前序结束
                root_index + 1,            // 右子树中序起始
                in_right);                 // 右子树中序结束

        return root;
    }
}
