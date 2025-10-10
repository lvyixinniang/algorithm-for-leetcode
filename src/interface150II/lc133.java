package interface150II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc133 {

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    private Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        return dfs (map, node);
    }

    private Node dfs(Map<Node, Node> map, Node node) {
        if (map.containsKey(node)) {
            return map.get(node);
        } else {
            Node newNode = new Node(node.val);
            map.put(node, newNode);
            for (int i = 0; i < node.neighbors.size(); i++) {
                newNode.neighbors.add(dfs(map, node.neighbors.get(i)));
            }
        }
        return map.get(node);
    }
}
