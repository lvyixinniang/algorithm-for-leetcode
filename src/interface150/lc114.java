package interface150;

import java.util.ArrayList;
import java.util.List;

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
        List<TreeNode> list = new ArrayList<>();
        if (root == null) return;
        BfsSearch(root, list);
        root.left = null;
        root.right = null;
        int count = 0;
        TreeNode curr = root;
        for (TreeNode re : list) {
            if (count == 0) {
                count ++;
                continue;
            }
            curr.left = null;
            curr.right = re;
            curr = curr.right;
        }
    }

    private void BfsSearch(TreeNode root, List<TreeNode> res) {
        if (root == null) return;
        res.add(root);
        if (root.left != null) BfsSearch(root.left, res);
        if (root.right != null) BfsSearch(root.right, res);
    }
}
