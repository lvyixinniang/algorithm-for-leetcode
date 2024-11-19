package leetcode.LCR.Tree;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class leetcode145 {
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
    public boolean checkSymmetricTree(TreeNode root) {
      if (root == null || (root.left == null && root.right == null)) return true;
        // 明显的 BFS
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);
      while (!queue.isEmpty()) {
          int size = queue.size();
          List<Integer> list = new ArrayList<>();
          while (size > 0) {
              TreeNode remove = queue.remove();
              if (remove.left != null) {
                  queue.add(remove.left);
                  list.add(remove.left.val);
              } else {
                  list.add(-1);
              }
              if (remove.right != null) {
                  queue.add(remove.right);
                  list.add(remove.right.val);
              } else {
                  list.add(-1);
              }
              size -- ;
          }
          // 判断 是否 为 翻转
          int flag = list.size() % 2;
          if (flag == 1) return false;
          for (int i = 0; i < list.size() / 2; i++) {
              if (list.get(i) != list.get(list.size() - 1 - i)) {
                  return false;
              }
          }
      }

        return true;
    }
}
