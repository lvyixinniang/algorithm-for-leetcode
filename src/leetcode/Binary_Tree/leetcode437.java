package leetcode.Binary_Tree;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class leetcode437 {
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
//  TODO 太难了， 想不到这样写
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        int ret = DFSSearch(root, targetSum);
        ret += pathSum(root.left, targetSum);
        ret += pathSum(root.right, targetSum);

        return ret;
    }

    private int DFSSearch(TreeNode root, int targetSum) {
        int ret = 0;

        if (root == null) {
            return 0;
        }
        int val = root.val;
        if (val == targetSum) {
            ret ++;
        }

        ret += DFSSearch(root.left, targetSum - val);
        ret += DFSSearch(root.right, targetSum - val);
        return ret;
    }
}
