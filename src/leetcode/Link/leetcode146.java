package leetcode.Link;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class leetcode146{
    class LRUCache  extends LinkedHashMap<Integer, Integer> {
        private int capacity;
        //  以 正整数 作为容量 capacity 初始化 LRU 缓存
        public LRUCache(int capacity) {
            super(capacity, 0.75f, true);
            this.capacity = capacity;

        }
        //   如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1
        public int get(int key) {
            return super.getOrDefault(key, -1);
        }
        //  如果关键字 key 已经存在，则变更其数据值 value ；如果不存在，则向缓存中插入该组 key-value 。
//  如果插入操作导致关键字数量超过 capacity ，则应该 逐出 最久未使用的关键字。
        public void put(int key, int value) {
            super.put(key, value);
        }
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }
    }
}
