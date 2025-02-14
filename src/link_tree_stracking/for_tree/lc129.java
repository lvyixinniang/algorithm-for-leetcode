package link_tree_stracking.for_tree;

public class lc129 {
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
  static int sum = 0;
    public static int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        // DFS
        dfsSearch(root, 0);
        return sum;
    }

    private static void dfsSearch(TreeNode root, int val) {
        val = val * 10 + root.val;
        if (root.left != null || root.right != null) {
            if (root.left != null) {
                dfsSearch(root.left, val);
            }
            if (root.right!= null) {
                dfsSearch(root.right, val);
            }
        } else {
             sum += val;
             return ;
         }
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(4, new TreeNode(9, new TreeNode(5), new TreeNode(1)), new TreeNode(0));
        TreeNode root = new TreeNode(1, new TreeNode(0), null);
//        TreeNode root = new TreeNode(1, null, new TreeNode(5));
        System.out.println(sumNumbers(root));
    }
}
