package interface150II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lc173 {
    
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


    class BSTIterator {
//  next是在中序遍历
        TreeNode root = null;

        List<Integer> list = new ArrayList<>(); // 记录中序遍历结果

        int index = 0;
        public BSTIterator(TreeNode root) {
            this.root = root;
            dfs(this.root, list);
        }

        public int next() {
            if (index < list.size()) {
                return list.get(index++);
            }else {
                return -1;
            }
        }

        public boolean hasNext() {
            return index < list.size();
        }

        private void dfs(TreeNode root,List<Integer> list) {
            if (root == null) return;
            dfs(root.left, list);
            list.add(root.val);
            dfs(root.right, list);
        }
    }




}
