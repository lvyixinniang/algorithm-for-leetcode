package leetcode.LCR;

public class leetcode143 {
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

    public static void main(String[] args) {
        TreeNode A = new TreeNode(3, new TreeNode(6, new TreeNode(1), new TreeNode(8)), new TreeNode(5));
        TreeNode B = new TreeNode(6, new TreeNode(1), null);
        System.out.println(isSubStructure(A, B));
    }
    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private static boolean recur(TreeNode a, TreeNode b) {
        if (b == null) return true;
        if ((a == null && b != null) || a.val != b.val) return false;
        return recur(a.left, b.left) && recur(a.right, b.right);
    }

}
