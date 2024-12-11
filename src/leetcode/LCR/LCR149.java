package leetcode.LCR;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class LCR149 {

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
    public static  int[] decorateRecord(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return new int[0];
        // 层序遍历
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                res.add(poll.val);
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
        }
        int[] arr = new int[res.size()];
        int index = 0;
        for (Integer re : res) {
            arr[index ++] = re;
        }
        return arr;
  }
}
