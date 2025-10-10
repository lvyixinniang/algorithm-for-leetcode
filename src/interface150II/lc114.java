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

    public void flatten(TreeNode root) {
        if (root == null) return;
//        前序遍历
        List<TreeNode> list = new ArrayList<TreeNode>();
        search(root,list);
        if (list.size() >= 2) {
            for (int i = 0; i < list.size() - 1; i++) {
                list.get(i).left = null;
                list.get(i).right = list.get(i + 1);
            }
        }

    }

    private void search(TreeNode root, List<TreeNode> list) {
        if (root == null) return;
        list.add(root);
        search(root.left, list);
        search(root.right, list);
    }
}
