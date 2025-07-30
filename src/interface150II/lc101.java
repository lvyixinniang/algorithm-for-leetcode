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
// todo 做的有些卡顿
    public boolean isSymmetric(TreeNode root) {
/*        // 层序遍历
        if (root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean flag = false;
            List<Integer> list = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) flag = true;
                list.add(node == null ?  -101: node.val);
                queue.add(node == null ? null : node.left);
                queue.add(node == null ? null : node.right);
            }
            if (!flag) break;
            for (int i = 0; i <= size / 2; i++) {
                if (list.get(i) != list.get(size - 1 - i)) return false;
            }
        }
        return true;*/

//        递归
        return root == null || isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;


        return left.val == right.val && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static void main(String[] args) {
//          TreeNode root = new TreeNode(1 ,new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        TreeNode root = new TreeNode(1,new TreeNode(0), null);
        lc101 solution = new lc101();
        System.out.println(solution.isSymmetric(root));
      }
}
