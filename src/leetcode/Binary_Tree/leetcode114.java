package leetcode.Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class leetcode114 {
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
    public static  void flatten(TreeNode root) {
        if (root == null) return ;
        TreeNode head = root;
//        先序遍历 将所有节点存入 List中
        List<TreeNode> list = new ArrayList<>();
        preSearch(root, list);
//        遍历 List 将其左右节点设置为 null
        for (int i = 1; i < list.size(); i++) {
            head.left = null;
            head.right = list.get(i);
            head.right.left = null;
            head.right.right = null;
            head = head.right;
        }
    }

    private static void preSearch(TreeNode node, List<TreeNode> list) {
        if (node == null) return ;
        list.add(node);
        preSearch(node.left,list);
        preSearch(node.right,list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2,new TreeNode(3),new TreeNode(4))
                ,new TreeNode(5, null, new TreeNode(6)));
        flatten(root);
    }
}
