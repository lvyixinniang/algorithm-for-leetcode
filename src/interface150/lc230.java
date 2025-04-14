package interface150;

import java.util.*;

public class lc230 {
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
    public int kthSmallest(TreeNode root, int k) {
        // DFS
        List<Integer> list = new ArrayList<>();
        DfsSearch(root, list);
        Collections.sort(list);
        return list.get(k - 1);
    }

    private void DfsSearch(TreeNode root, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        DfsSearch(root.left, list);
        DfsSearch(root.right, list);
    }
}
