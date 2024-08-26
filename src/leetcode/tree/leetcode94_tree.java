package leetcode.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class leetcode94_tree {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        midSearch(root,list);
        return list;
    }

    public static void midSearch(TreeNode root , List list) {
        if (root == null){
            return;
        }
        midSearch(root.left,list);
        list.add(root.val);
        midSearch(root.right,list);
    }
}
