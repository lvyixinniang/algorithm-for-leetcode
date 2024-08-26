package leetcode.tree;

import java.util.Map;

public class leetcode105 {
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

    private Map<Integer,Integer> indexMap;

//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//
//    }
//    public TreeNode BUidTree (int[] preorder,int[] inorder,int preleft,int preright, int inleft,int inright){
//        if (preleft > preright){
//            return null;
//        }
////        int pre
//    }
}
