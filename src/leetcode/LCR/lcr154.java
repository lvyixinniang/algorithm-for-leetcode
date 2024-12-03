package leetcode.LCR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lcr154 {
    public static void main(String[] args) {
        Node head = new Node(7);
        Node h1 = new Node(13);
        Node h2 = new Node(11);
        Node h3 = new Node(10);
        Node h4 = new Node(1);
        head.next = h1;
        h1.next = h2;
        h1.random = head;
        h2.next = h3;
        h3.next = h4;
        h2.random = h4;
        h3.random = h2;
        h4.random = head;

        copyRandomList(head);
    }
    public static  Node copyRandomList(Node head) {
        if (head == null) return head;
        Node curr = head;
        // 一步步蚕食
        Map<Node, Node> map = new HashMap<>();
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
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
}
