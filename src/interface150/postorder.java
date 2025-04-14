package interface150;

import java.util.Stack;

public class postorder {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    // 后续遍历
    public static void postorderOneStack(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;

        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode peek = stack.peek();
                if (peek.right != null && peek.right != lastVisited) {
                    curr = peek.right;
                } else {
                    System.out.println(peek.val + " ");
                    lastVisited = stack.pop();
                }
            }
        }
    }
    public static void main(String[] args) {
        // 构建二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);


        System.out.println("\nOne stack method:");
        postorderOneStack(root);
    }
}
