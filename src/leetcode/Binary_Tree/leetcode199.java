package leetcode.Binary_Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class leetcode199 {
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
    public static List<Integer> rightSideView(TreeNode root) {
//        层次遍历 每次选取 最右的值
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.add(root.val);
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode poll = queue.poll();
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
                size --;
            }
            if (queue.size() != 0) list.add(queue.getLast().val);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(4)));
        rightSideView(root);
    }
}
