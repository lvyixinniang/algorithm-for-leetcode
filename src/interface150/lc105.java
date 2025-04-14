package interface150;

import java.util.HashMap;
import java.util.Map;

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
  
  private Map<Integer, Integer> indexMap;
  
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < len; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, len - 1, 0, len -1);
    }

    private TreeNode myBuildTree(int[] preorder, int[] inorder, int pre_left, int pre_right, int in_left, int in_right) {
//        if (pre_left > pre_right) return null;
        // 查询根节点位置
        int index_root = indexMap.get(preorder[pre_left]);
        // 在中序遍历中左子树大小
        int size_left = index_root - in_left;
        TreeNode root = new TreeNode(preorder[pre_left]);

        root.left = myBuildTree(preorder, inorder, pre_left + 1, pre_left + size_left, in_left, index_root - 1);
        root.right = myBuildTree(preorder, inorder, pre_left + size_left + 1, pre_right, index_root + 1, in_right);
        return root;
    }
}
