package leetcode.Link;

import java.util.HashMap;
import java.util.Map;

public class leetcode138 {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    static Map<Node,Node> cacheNode = new HashMap<>();
    public static Node copyRandomList(Node head) {
        if (head == null) return head;

        if (!cacheNode.containsKey(head)) {
            Node headNew = new Node(head.val);
            cacheNode.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return cacheNode.get(head);
    }
}
