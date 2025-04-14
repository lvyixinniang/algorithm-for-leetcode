package interface150;

public class lc236 {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    private TreeNode ans  = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        DfsSearch (root, p, q);
        return ans;
    }

    private boolean DfsSearch(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean lson = DfsSearch(root.left, p, q);
        boolean rson = DfsSearch(root.right, p, q);
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            ans = root;
        }
        return lson || rson || (root.val == p.val || root.val == q.val);
    }

}
