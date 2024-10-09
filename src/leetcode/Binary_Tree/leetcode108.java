package leetcode.Binary_Tree;

import java.util.ArrayList;
import java.util.List;

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
    int aim = 1;
    public TreeNode sortedArrayToBST(int[] nums) {
//        是 中序遍历的 逆过程
        return addNode(nums, 0, nums.length - 1);
    }

    private TreeNode addNode(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
//        总是选择中间位置 左边 的数字 作为根节点
        int mid = (right - left) / 2 + left;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = addNode(nums,left, mid - 1);
        root.right = addNode(nums,mid + 1, right);
        return root;
    }
}
