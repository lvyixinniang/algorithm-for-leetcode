package interface150II;

import java.util.*;

public class lc146 {
//todo 不会啊
    class LRUCache {
        class DlinkNode {
            int key, value;
            DlinkNode prev, next;
            DlinkNode() {}
            DlinkNode(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private Map<Integer, DlinkNode> cache = new HashMap<>();
        private DlinkNode head, tail;
        private int capacity, size;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        head = new DlinkNode();
        tail = new DlinkNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DlinkNode node = cache.get(key);
        if (node == null) return -1;
        moveToHead(node); // 访问后移到链表头部（最近使用）
        return node.value;
    }

    public void put(int key, int value) {
        DlinkNode node = cache.get(key);
        if (node != null) {
            // if 该节点存在
            node.value = value;
            cache.put(key, node);
            moveToHead(node);
        } else {
            // if 该节点不存在
            if (size >= capacity) {
                DlinkNode last = removeTail();
                cache.remove(last.key);
                size--;
            }
            node = new DlinkNode(key, value);
            addToHead(node);          // 未先移除旧节点
            cache.put(key, node);     // 重复放入缓存
            size++;                   // 错误增加size
        }
    }

    private void addToHead(DlinkNode node) {
        head.next.prev = node;  // 错误顺序：此时head.next可能已被修改
        node.next = head.next;
        head.next = node;
        node.prev = head;
    }

    private void removeNode(DlinkNode node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    private void moveToHead(DlinkNode node) {
        removeNode(node);
        addToHead(node);
    }

    private DlinkNode removeTail() {
        DlinkNode prev = tail.prev;
        removeNode(prev);
        return prev;
    }

    }
}
