package interface150III;

import java.util.*;

/**
 * @author hc
 * @date
 **/
public class lc133 {
// todo 太久没做了，完全没什么思路
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

    // todo 旧节点node  --对应-- 新节点newNode
    private Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null || node.neighbors == null) return node;
        return dfs(map, node);
    }

    private Node dfs(Map<Node, Node> map, Node node) {
        if (map.containsKey(node)) {
            return map.get(node);
        } else {
            Node newNode = new Node(node.val);
            map.put(node, newNode);
            for (Node neighbor : node.neighbors) {
                newNode.neighbors.add(dfs(map, neighbor));
            }
        }
        return map.get(node);
    }
}
