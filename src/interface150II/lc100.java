package interface150II;

public class lc100 {

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return searchEquals(p, q);
    }

    private boolean searchEquals(TreeNode p, TreeNode q) {
          // 先是终止条件
        if (p == null && q == null) return true;
        else if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return searchEquals(p.left, q.left) && searchEquals(p.right, q.right);
   }


}
