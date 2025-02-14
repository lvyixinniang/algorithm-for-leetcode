package link_tree_stracking.dfs_tree;



public class lc1026 {
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
  static int maxx = 0;
  static int minn = Integer.MAX_VALUE;
    public static int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        // dfs
        dfsSearch(root);
        return maxx - minn;
    }

    private static void dfsSearch(TreeNode root) {
        if (root == null) return;
        int val = root.val;
        if (val < minn) minn = val;
        if (val > maxx) maxx = val;
        if (root.left != null) dfsSearch(root.left);
        if (root.right != null) dfsSearch(root.right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(8, new TreeNode(3, new TreeNode(1), new TreeNode(6, new TreeNode(4),new TreeNode(7))), new TreeNode(10, null, new TreeNode(14,new TreeNode(13),null)));
        System.out.println(maxAncestorDiff(node));
    }
}
