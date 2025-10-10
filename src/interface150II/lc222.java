package interface150II;

import java.util.LinkedList;
import java.util.Queue;

public class lc222 {

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
int sum = 0;
    public int countNodes(TreeNode root) {
        // 层序遍历
        if(root == null) return 0;
        dfs(root);
        return sum;
    }

    private void dfs(TreeNode root) {
        // 后续遍历吧
        if(root == null) return;
        dfs(root.left);
        dfs(root.right);
        sum++;
    }
}
