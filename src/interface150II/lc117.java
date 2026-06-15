package interface150II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lc117 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        root.next = null;
        while (!q.isEmpty()) {
            List<Node> list = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (node.left != null) {
                    q.add(node.left);
                    list.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                    list.add(node.right);
                }
            }

            for (int i = 0; i < list.size() - 1; i++) {
                list.get(i).next = list.get(i + 1);
            }
            if (list.size() > 0) list.get(list.size() - 1).next = null;
        }
        return root;
    }
}
