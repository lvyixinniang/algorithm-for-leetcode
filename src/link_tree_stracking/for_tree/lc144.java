package link_tree_stracking.for_tree;

import java.util.ArrayList;
import java.util.List;

public class lc144 {
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
    public List<Integer> preorderTraversal(TreeNode root) {
      ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        // 递归查询
        dfsSearch(root, res);
        return res;
    }

    private void dfsSearch(TreeNode root, ArrayList<Integer> res) {
        if (root.left != null) dfsSearch(root.left, res);
        if (root.right != null) dfsSearch(root.right, res);
        res.add(root.val);
    }
}
