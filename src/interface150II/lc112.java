package interface150II;

public class lc112 {
    
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

    public boolean hasPathSum(TreeNode root, int targetSum) {
          if (root == null) return false;
        return dfs(root, targetSum, 0);
    }

    private boolean dfs(TreeNode root, int targetSum, int sum) {
        sum += root.val;
        boolean left = root.left !=null ? dfs(root.left, targetSum, sum) : false;
        boolean right = root.right !=null ? dfs(root.right, targetSum, sum) : false;
        if (root.left == null && root.right == null) {
            return sum == targetSum;
        }
        return left || right;
    }

    public static void main(String[] args) {
        lc112 lc112 = new lc112();
        TreeNode root = new TreeNode(5, new TreeNode(4,new TreeNode(11,new TreeNode(7), new TreeNode(2)), null), new TreeNode(8,new TreeNode(13), new TreeNode(4,null,new TreeNode(1))));
        lc112.hasPathSum(root, 22);
      }
}
