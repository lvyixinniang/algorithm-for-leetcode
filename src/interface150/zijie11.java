package interface150;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class zijie11 {
  public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
      this.val = val;
    }
  }
    public ArrayList<ArrayList<Integer>> Print (TreeNode pRoot) {
        // write code here
        // 层序遍历
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(pRoot);
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                list.add(node.val);
                if (node.left != null) {q.offer(node.left);}
                if (node.right != null) {q.offer(node.right);}
            }
            res.add(list);
        }
        return res;
    }
}
