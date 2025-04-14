package interface150;


import java.util.*;

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
        // DFS 先序
        if (root == null) return 0;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        DfsSearch(root, list, sb);
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    private void DfsSearch(TreeNode root, List<Integer> list, StringBuilder sb) {
        if (root == null) {
            return;
        }
        // 决策树？？？
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(Integer.parseInt(sb.toString()));
        }else {
            DfsSearch(root.left, list, sb);
            DfsSearch(root.right, list, sb);
        }
        sb.deleteCharAt(sb.length() - 1);
    }

    public static void main(String[] args) {
        lc129 lc129 = new lc129();
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(lc129.sumNumbers(root));
    }
}
