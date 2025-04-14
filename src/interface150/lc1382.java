package interface150;

import java.util.ArrayList;
import java.util.List;

public class lc1382 {
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
    public TreeNode balanceBST(TreeNode root) {
        // 先中序遍历,得到节点，再转变为平衡
        if (root == null) return null;
        List<Integer> list = new ArrayList<>();
        // 中序遍历
        DfsSearch(root, list);
        // 再将中序结果 ， 转换为二叉平衡树
        return HelperBuilder (list, 0, list.size() - 1);
    }

    private TreeNode HelperBuilder(List<Integer> list, int left, int right) {
      if (left > right) return null;
      int mid = left + (right - left) / 2;
      TreeNode root = new TreeNode(list.get(mid));
      root.left = HelperBuilder(list, left, mid - 1);
      root.right = HelperBuilder(list, mid + 1, right);
      return root;
    }

    private void DfsSearch(TreeNode root, List<Integer> list) {
        if (root == null) return;
        DfsSearch(root.left, list);
        list.add(root.val);
        DfsSearch(root.right, list);
    }
}
