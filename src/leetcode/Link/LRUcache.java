package leetcode.Link;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache extends LinkedHashMap<Integer,Integer> {
    private int capacity;
    public LRUCache(int capacity) {
//        capacity: 这是 LinkedHashMap 的容量
//        0.75F: 这个参数是 LinkedHashMap 的加载因子。加载因子用于控制何时应该对哈希表进行重新哈希
//        传递 true，我们告诉 LinkedHashMap 按照元素的访问顺序维护它们，这样我们就可以轻松地找到并删除最久未访问的元素。
        super(capacity,0.75F,true);
        this.capacity = capacity;

    }

    public int get(int key) {
        return super.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        super.put(key,value);
    }

    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest) {
        return size() > capacity;
    }
}
