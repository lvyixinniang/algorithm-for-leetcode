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
  static int maxLen = 0;
    public static int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        // dfs
            // 临时变量
        int currMax = 0;
        int currMin = Integer.MAX_VALUE;
        dfsSearch(root, currMax, currMin);
        return maxLen;
    }

    private static void dfsSearch(TreeNode root, int currMax, int currMin) {
        if (root == null) return;
        if (root.val > currMax) currMax = root.val;
        if (root.val < currMin) currMin = root.val;
        if (currMax - currMin > maxLen) maxLen = currMax - currMin;
        dfsSearch(root.left, currMax, currMin);
        dfsSearch(root.right, currMax, currMin);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(8, new TreeNode(3, new TreeNode(1), new TreeNode(6, new TreeNode(4),new TreeNode(7))), new TreeNode(10, null, new TreeNode(14,new TreeNode(13),null)));
        System.out.println(maxAncestorDiff(node));
    }
}
