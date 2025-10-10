package interface150II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lc102 {


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


        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) return new ArrayList<>();
            List<List<Integer>> res = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                List<Integer> list = new ArrayList<>();
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = q.poll();
                    list.add(node.val);
                    if (node.left != null) q.add(node.left);
                    if (node.right != null) q.add(node.right);
                }
                res.add(list);
            }
            return res;
        }

}
