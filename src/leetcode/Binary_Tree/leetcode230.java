package leetcode.Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class leetcode230 {
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
    public int kthSmallest(TreeNode root, int k) {
//        先 二叉树转换为 数组
        List<Integer> list = new ArrayList<>();
        SearchVal(root,list);
//        排序 (倒序）
        list.sort((o1,o2) ->o2 - o1);
//        得到 导数第 K 值
        return list.get(list.size() - k);
    }

    private void SearchVal(TreeNode node, List<Integer> list) {
      if (node == null) return ;
      list.add(node.val);
      SearchVal(node.left, list);
      SearchVal(node.right,list);
    }
}
