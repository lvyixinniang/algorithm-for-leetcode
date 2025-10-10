package interface150II;

import java.util.*;

public class lc146 {
//todo 不会啊 8/31日重做(链表实现，但更推荐双向链表实现
    class LRUCache {
        class Node {
            int key;
            int value;
            Node prev;
            Node next;
        }

        private final int capacity;
        private final Map<Integer, Node> cache;
        private final Node head;
        private final Node tail;
        private int size;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.cache = new HashMap<>();
            this.head = new Node();
            this.tail = new Node();
            this.head.next = this.tail;
            this.tail.prev = this.head;
        }

        public int get(int key) {
            Node node = cache.get(key);
            if (node == null) return -1;

            moveToHead(node);
            return node.value;
        }

        public void put(int key, int value) {
            Node node = cache.get(key);
            if (node != null) {
                node.value = value;
                moveToHead(node);
            } else {
                Node newNode = new Node();
                newNode.key = key;
                newNode.value = value;

                cache.put(key, newNode);
                addToHead(newNode);
                size++;

                if (size > capacity) {
                    Node tailNode = removeTail();
                    cache.remove(tailNode.key);
                    size--;
                }
            }
        }

    private Node removeTail() {

        return null;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(Node node) {
    }

    private void addToHead(Node node) {
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
        }
}
}
