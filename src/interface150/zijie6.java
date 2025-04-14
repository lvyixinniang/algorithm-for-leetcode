package interface150;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zijie6 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    TreeNode KthNode(TreeNode pRoot, int k) {
        // 层序 遍历
        if (pRoot == null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        List<TreeNode> res = new LinkedList<>();
        q.add(pRoot);
        res.add(pRoot);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                res.add(node);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
        }
        res.sort((o1, o2) -> o1.val - o2.val);
        return k > 0 && k < res.size() ? res.get(k - 1) : null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode root1 = new TreeNode(6);
        TreeNode root2 = new TreeNode(7);
        TreeNode root3= new TreeNode(8);
        TreeNode root4 = new TreeNode(9);
        TreeNode root5 = new TreeNode(10);
        TreeNode root6 = new TreeNode(11);
        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        root2.left = root5;
        root2.right = root6;
        zijie6 zijie6 = new zijie6();
        zijie6.KthNode(root, 1);
    }
}
