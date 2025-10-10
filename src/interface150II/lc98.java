package interface150II;

import java.util.ArrayList;
import java.util.List;

public class lc98 {
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
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        //前序遍历，判断是否有顺序不对
        return dfsPre(root,list);
    }

    private boolean dfsPre(TreeNode root, List<Integer> list) {
        if (root == null) return true;
        boolean flagleft = dfsPre(root.left,list);

        boolean flag = false;
        if (list.size() == 0) flag = true;
        else flag = root.val > list.get(list.size()-1);
        list.add(root.val);
        boolean flagright = dfsPre(root.right,list);
        // 没有继承我的一致性
        return flag && flagleft && flagright;
    }
}
