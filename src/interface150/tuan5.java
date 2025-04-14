package interface150;

import java.util.ArrayList;
import java.util.List;

public class tuan5 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
/*    public TreeNode Convert(TreeNode pRootOfTree) {
        // 先中序遍历
        if (pRootOfTree == null) return null;
        List<TreeNode> res = new ArrayList<>();
        DfsSearch(pRootOfTree, res);
        TreeNode prev = null;
        for (TreeNode curr : res) {
            curr.left = prev;
            if (prev != null) prev.right = curr;
            prev = curr;
        }
        return res.get(0);
    }
    private void DfsSearch(TreeNode root, List<TreeNode> res) {
        if (root == null) return;
        DfsSearch(root.left, res);
        res.add(root);
        DfsSearch(root.right, res);
    }*/

    TreeNode root = null;
    TreeNode prev = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        Dfs (pRootOfTree);
        return root;
    }

    private void Dfs(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return;
        Dfs(pRootOfTree.left);
        if (prev == null)   {
            root = pRootOfTree;
        }
        if (prev != null) {
            prev.right = pRootOfTree;
        }
        pRootOfTree.left = prev;
        prev = pRootOfTree;
        Dfs(pRootOfTree.right);
    }
}
