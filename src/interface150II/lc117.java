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
        while (!q.isEmpty()) {
            int size = q.size();
            List<Node> nodes = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                nodes.add(node);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            if (nodes.size() > 1) {
                for (int i = 0; i < nodes.size() - 1; i++) {
                    nodes.get(i).next = nodes.get(i + 1);
                }
            }
        }
        return root;
    }
}
