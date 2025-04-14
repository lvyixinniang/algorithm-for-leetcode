package interface150;

import java.util.*;

public class lc146 {

    class LRUCache {
        // 使用hashmap来O(1)获取
        Map<Integer, Integer> map;
        // 维护一个 双端队列 来完成 LRU
        // 队首是最近使用的， 队尾 反之
        ArrayDeque<Integer> queue;
        // 容量
        int capacity;
        // 当前大小
        int currSize = 0;

        public LRUCache(int capacity) {
            map = new HashMap<>();
            queue = new ArrayDeque<>();
            this.capacity = capacity;
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                queue.remove(key);
                queue.addFirst(key);
                return map.get(key);
            } else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                map.put(key, value);
                // 当前被使用了
                queue.remove(key);
                queue.addFirst(key);
            } else {
                if (currSize <= capacity - 1) {
                    // 说明还有容量
                    currSize += 1;
                    queue.addFirst(key);
                    map.put(key, value);
                } else {
                    // 没有容量了
                    Integer last = queue.removeLast();
                    map.remove(last);
                    queue.addFirst(key);
                    map.put(key, value);
                }
            }
        }
    }
}
