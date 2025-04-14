package interface150;

import java.util.ArrayList;
import java.util.List;

public class tent10 {
  public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
      this.val = val;
    }
      public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public int sumNumbers (TreeNode root) {
        // write code here
        if (root == null) return 0;
        List<Integer> list = new ArrayList<>();
        DfsSearch (root, list, 0);
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    private void DfsSearch(TreeNode root, List<Integer> list, int val) {
        if (root == null) return;
        val = val * 10 + root.val;
        // 决策树
        if (root.left == null && root.right == null) {
            list.add(val);
            return;
        };
        DfsSearch(root.left, list, val);
        DfsSearch(root.right, list, val);
        val = (val - root.val) / 10;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        tent10 tent10 = new tent10();
        System.out.println(tent10.sumNumbers(root));
  }
}
