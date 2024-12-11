package leetcode.LCR;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LCR151 {
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
    public static List<List<Integer>> decorateRecord(TreeNode root) {
        // 层序遍历
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size > 0) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
                size --;
            }
            res.add(list);
        }
        // 偶数翻转
        int ceng = res.size();
        for (int i = 1; i <= ceng; i++) {
            if (i % 2 != 0) continue;
            List<Integer> integers = res.get(i - 1);
            // 二分交换
            int l = 0, r = integers.size() - 1;
            for (; l < r; l++, r --) {
                Integer integer = integers.get(l);
                integers.set(l, integers.get(r));
                integers.set(r, integer);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8, new TreeNode(17, new TreeNode(18), null), new TreeNode(21, null, new TreeNode(6)));
        decorateRecord(root);
    }
}
