package leetcode.tree;

public class leetcode108 {
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
        System.out.println((3+2)>>1);
        System.out.println((3+2)>>>1);
        System.out.println((3+2)/2);
        return helper(nums,0,nums.length-1);
    }
    public TreeNode helper (int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right) >>2;

        TreeNode root  = new TreeNode(nums[mid]);
        root.left = helper(nums,left,mid-1);
        root.right = helper(nums,mid+1,right);

        return root;
    }
}
