package interface150II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lc114 {
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

  private static List<TreeNode> list = new ArrayList<TreeNode>();

  public void flatten(TreeNode root) {
        if (root == null) return;
        preSearch(root);
      for (int i = 0; i < list.size() - 1; i++) {
          list.get(i).left = null;
          list.get(i).right = list.get(i + 1);
      }
  }

  private void preSearch(TreeNode root) {
      if (root == null) return;
      list.add(root);
      preSearch(root.left);
      preSearch(root.right);
  }

}
