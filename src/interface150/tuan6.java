package interface150;

import java.util.ArrayList;
import java.util.List;

public class tuan6 {

  public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
      this.val = val;
    }
  }
    public int[][] threeOrders (TreeNode root) {
        // write code here
        if (root == null ) return new int[3][0];
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>()); // 先序
        res.add(new ArrayList<>()); // 中序
        res.add(new ArrayList<>()); // 后序
        Dfs (root, res);
        int[][] ans = new int[3][res.get(0).size()];
        for (int i = 0; i < res.get(0).size(); i++) {
            ans[0][i] = res.get(0).get(i);
            ans[1][i] = res.get(1).get(i);
            ans[2][i] = res.get(2).get(i);
        }
        return ans;
  }

    private void Dfs(TreeNode root, List<List<Integer>> res) {
        if (root == null) return;
        res.get(0).add(root.val);
        if (root.left != null) Dfs(root.left, res);
        res.get(1).add(root.val);
        if (root.right != null) Dfs(root.right, res);
        res.get(2).add(root.val);
    }
}
