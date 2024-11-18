package leetcode.LCR;

import java.util.HashMap;

public class leetcode124 {
    public static void main(String[] args) {
//        System.out.println(deduceTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7}));
    }
  public static class TreeNode {
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
    public TreeNode deduceTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        return build(preorder, inorder, 0, len - 1, 0, len - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int prestart, int preend, int instart, int inend) {
        if (prestart > preend || instart > inend) {
            return null;
        }

        // 查找在 中序遍历的 位置
        int value = preorder[prestart];
        int index = 0;
        for (int i = instart; i <= inend; i++) {
            if (inorder[i] == value) {
                index = i;
                break;
            }
        }
        TreeNode root = new TreeNode(value);
//        root.left = build(preorder,inorder,preStart + 1,preStart + leftSize,inStart , index - 1);
//        root.right = build(preorder,inorder,preStart + leftSize + 1,preEnd,index + 1 , inEnd);
//        return root;
        // 左子树长度
        int leftlen = index - instart;
        root.left = build(preorder, inorder, prestart + 1, prestart + leftlen, instart, index - 1);
        root.right = build(preorder, inorder, prestart + leftlen + 1, preend, index + 1, inend);
        return root;
    }
}
