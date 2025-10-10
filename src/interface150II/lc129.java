package interface150II;

import java.util.ArrayList;
import java.util.List;

public class lc129 {
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


    public int sumNumbers(TreeNode root) {
        // 不存在 为空
        List<Integer> list = new ArrayList<>();
        dfs(root, list, 0);
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    private void dfs(TreeNode root, List<Integer> list, int sum) {
        if (root == null) return;

        sum = sum * 10 + root.val;
        dfs(root.left, list, sum);
        dfs(root.right, list, sum);

        if (root.left == null && root.right == null) {
            list.add(sum);
        }
    }


    public static void main(String[] args) {
        lc129 lc129 = new lc129();
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(lc129.sumNumbers(root));
    }
}
