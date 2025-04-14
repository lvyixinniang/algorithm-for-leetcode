package interface150;

import java.util.HashMap;
import java.util.Map;

public class lc106 {
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
    private Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      int len = inorder.length;
        for (int i = 0; i < len; i++) {
            map.put(inorder[i], i);
        }
      return myBuildeTree(inorder, postorder, 0, len - 1, 0, len - 1);
    }

    private TreeNode myBuildeTree(int[] inorder, int[] postorder, int in_left, int in_right, int post_left, int post_right) {
        if (post_left > post_right) return null;
        TreeNode root = new TreeNode(postorder[post_right]);
        int index_root = map.get(root.val);
        int size = index_root - in_left;
        root.left = myBuildeTree(inorder, postorder,
                in_left, index_root - 1,
                post_left, post_left + size - 1);
        root.right = myBuildeTree(inorder, postorder,
                index_root + 1, in_right,
                post_left + size, post_right - 1);
        return root;
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        lc106 lc106 = new lc106();
        lc106.buildTree(new int[]{9,3,15,20,7}, new int[]{9,15,7,20,3});
    }
}
