package link_tree_stracking.dfs_tree;

public class lc104 {

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
  static int maxD = 1;
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        // dfs
        int currDepth = 1;
        dfsSearch(root, currDepth);
        return maxD - 1;
    }

    private static void dfsSearch(TreeNode root, int currDepth) {
        if (root == null) {
            if (currDepth > maxD) maxD = currDepth;
            return;
        }
        dfsSearch(root.left, currDepth + 1);
        dfsSearch(root.right, currDepth + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(maxDepth(root));
    }
}
