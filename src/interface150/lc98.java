package interface150;

public class lc98 {

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

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return DfsSearch(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean DfsSearch(TreeNode root, int minValue, int maxValue) {
        if (root == null) return true;
        if (root.val < minValue || root.val > maxValue) return false;
        return DfsSearch(root.left, minValue, root.val) && DfsSearch(root.right, root.val, maxValue);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(1), new TreeNode(4)), new TreeNode(8, new TreeNode(6), new TreeNode(9)));
        lc98 lc98 = new lc98();
        lc98.isValidBST(root);
    }
}
