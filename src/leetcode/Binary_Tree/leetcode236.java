package leetcode.Binary_Tree;

public class leetcode236 {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
//  TODO 想不到，也写不出来
    private TreeNode ans;
  public leetcode236() {
        this.ans = null;
  }
  private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
      if (root == null) return false;
      boolean lson = dfs(root.left, p, q);
      boolean rson = dfs(root.right, p, q);
      if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
          ans = root;
      }
      return lson || rson || (root.val == p.val || root.val == q.val);
  }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }
}
