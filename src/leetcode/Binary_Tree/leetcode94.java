package leetcode.Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class leetcode94 {
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
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        midSreach(root);
        return list;
    }

    private void midSreach(TreeNode root) {
        if (root == null) return ;
        midSreach(root.left);
        list.add(root.val);
        midSreach(root.right);
    }
}
