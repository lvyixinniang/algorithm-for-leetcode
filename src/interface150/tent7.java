package interface150;

public class tent7 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    private TreeNode head = null;
    private TreeNode prev = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        inorder(pRootOfTree);
        return head;
    }

    private void inorder(TreeNode curr) {
        if (curr == null) return;
        inorder(curr.left);
        if (prev == null) {
            head = curr;
        }else {
            prev.right = curr;
        }
        // 节点前进
        curr.left = prev;
        prev = curr;
        inorder(curr.right);
    }
    public static void main(String[] args) {
        // 构建二叉搜索树
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        // 转换为双向链表
        tent7 obj = new tent7();
        TreeNode ans = obj.Convert(root);

    }
}
