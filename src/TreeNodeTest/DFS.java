package TreeNodeTest;


import java.util.ArrayList;
import java.util.List;

public class DFS {

    public  class TreeNode {
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
     List<Integer> res = new ArrayList<>();
    public  List<Integer> DFS(DFS.TreeNode root) {
        if (root == null) return null;
        res.add(root.val);
        if (root.left != null) {
            DFS(root.left);
        }
        if (root.right != null) {
            DFS(root.right);
        }
        return res;
    }
}
