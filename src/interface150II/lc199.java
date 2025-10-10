package interface150II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lc199 {

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

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        List<TreeNode> q = new ArrayList<>();
        q.add(root);
        res.add(root.val);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.remove(0);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            if (q.size()!= 0) res.add(q.get(q.size() - 1).val);
        }
        return res;
    }

    public static void main(String[] args) {
          TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));
          lc199 lc199 = new lc199();
          lc199.rightSideView(root);
    }
}
