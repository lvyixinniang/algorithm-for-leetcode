package interface150II;

import java.util.*;

public class lc103 {

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        int odd = 0;
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            odd++;
            if (odd % 2 == 1) {
                // 正序遍历
                for (int i = 0; i < size; i++) {
                    TreeNode poll = q.poll();
                    list.add(poll.val);
                    if (poll.left != null) q.add(poll.left);
                    if (poll.right != null) q.add(poll.right);
                }
            } else {
                // 范旭遍历
                for (int i = size - 1; i >= 0; i--) {
                    TreeNode poll = q.poll();
                    list.add(poll.val);
                    if (poll.left != null) q.add(poll.left);
                    if (poll.right != null) q.add(poll.right);
                }
                Collections.reverse(list);
            }
            res.add(list);
        }
        return res;
    }
}
