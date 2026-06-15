package interface150II;

import java.util.*;

public class lc101 {

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

    private final static int Null_num = Integer.MAX_VALUE;

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            int[] arr = new int[2 * size + 1];
            Arrays.fill(arr, Null_num);

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null) {
                    q.add(curr.left);
                    arr[i * 2+ 1] = curr.left.val;
                }
                if (curr.right != null) {
                    q.add(curr.right);
                    arr[i * 2 + 2] = curr.right.val;
                }
             }
            // 判断
            for (int i = 1; i <= 2 * size; i++) {
                if (arr[i] != arr[2 * size + 1 - i]) return false;
            }
        }
        return true;
    }
}
