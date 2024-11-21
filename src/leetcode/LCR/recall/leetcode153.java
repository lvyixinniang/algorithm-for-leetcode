package leetcode.LCR.recall;

import java.util.ArrayList;
import java.util.List;

public class leetcode153 {
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
  List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathTarget(TreeNode root, int target) {
        dfs (root, target, new ArrayList<Integer>());
        return res;
    }

    private void dfs(TreeNode root, int target, ArrayList<Integer> list) {
        if (root == null) return;
        // 必须 是 根节点 到 叶子结点的
        if (root.val == target && root.left == null && root.right == null) {
            res.add(new ArrayList<>(list));
        }
        dfs(root.left, target - root.val, new ArrayList<>(list));
        dfs(root.right, target - root.val, new ArrayList<>(list));
    }
}
