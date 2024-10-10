package leetcode.Binary_Tree;

public class leetcode98 {
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

/*//  此方法没有考虑到 子树和根节点之间的关系
  boolean flag = true;
    public boolean isValidBST(TreeNode root) {
        judgeSearchTree(root);
        return flag;
    }

    private boolean judgeSearchTree(TreeNode root) {
        if (root == null) return true;
        if (root.left != null && root.left.val >= root.val){
            flag = false;
            return false;
        }
        if (root.right != null && root.right.val <= root.val) {
            flag = false;
            return false;
        }
      judgeSearchTree(root.left);
      judgeSearchTree(root.right);

      return true;
    }*/

    public static boolean isValidBST(TreeNode root) {
        return judgeSearchTree(root, Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private static boolean judgeSearchTree(TreeNode node, long lower, long upper) {
        if (node == null) return true;
        if (node.val <= lower || node.val >= upper) return false;
        return judgeSearchTree(node.left,lower,node.val) && judgeSearchTree(node.right, node.val, upper);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
                new TreeNode(4),new TreeNode(6,
                new TreeNode(3),new TreeNode(7)));
        isValidBST(root);
    }
}
