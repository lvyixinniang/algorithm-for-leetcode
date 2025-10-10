package interface150II;

import java.util.ArrayList;
import java.util.List;

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

  List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        minDfs(root);
        return list.get(k - 1);
    }

    private void minDfs(TreeNode root) {
        if (root == null) return;
        minDfs(root.left);
        list.add(root.val);
        minDfs(root.right);
    }
}
