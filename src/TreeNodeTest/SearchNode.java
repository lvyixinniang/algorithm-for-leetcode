package TreeNodeTest;

public class SearchNode {
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
    public TreeNode searchNode (int target, TreeNode root) {
        System.out.println("当前的节点数值为：" + root.val);
        if (root.val == target) {
            return root;
        }
        if (root.left != null) {
            return searchNode(target, root.left);
        }
        if (root.right != null) {
            return searchNode(target, root.right);
        }
        return null;
    }
}
