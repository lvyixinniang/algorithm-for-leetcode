package interface150II;

public class lc108 {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        // 每次都找 中间元素（偶数+1）
        if (nums.length == 0) return null;
        TreeNode root = build(nums,0, nums.length - 1);
        return root;
    }

    private TreeNode build(int[] nums, int start, int end) {
        if (start > end) return null;
        int root_index = start +(end-start)/2;
        int root_val = nums[root_index];
        TreeNode root = new TreeNode(root_val);
        root.left = build(nums, start, root_index - 1);
        root.right = build(nums, root_index + 1, end);

        return root;
    }
}
