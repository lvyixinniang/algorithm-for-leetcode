package leetcode.LCR.Tree;

import TreeNodeTest.DFS;
import sun.awt.image.ImageWatched;

import java.util.*;

public class leetcode155 {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };
    Node pre, head;
    public Node treeToDoublyList(Node root) {
        // BFS
        if (root == null) return null;
        Dfs(root);
        // 排序
       head.left = pre;
       pre.right = head;
        return head;
    }

    private void Dfs(Node root) {
        if (root == null) return;
        Dfs(root.left);
        if (pre != null) {
            pre.right = root;
        } else {
            head = root;
        }
        root.left = pre;
        pre = root;
        Dfs(root.right);
    }
}
