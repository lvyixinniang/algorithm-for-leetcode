package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc138 {
//    todo 想不到解决办法
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    Map<Node, Node> cacheNode = new HashMap<Node, Node>();

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        if (!cacheNode.containsKey(head)) {
            Node headNew = new Node(head.val);
            cacheNode.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return cacheNode.get(head);
    }
}
