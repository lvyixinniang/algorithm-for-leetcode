package leetcode.LCR;

import java.util.HashMap;
import java.util.Map;

public class LCR167 {
    public static void main(String[] args) {
        System.out.println(dismantlingAction("abba"));
    }
    public static  int dismantlingAction(String arr) {
        // 哈希表 + 滑动窗口
        Map<Character, Integer> map = new HashMap<>();
        int len = arr.length();
        int maxx = 0, l = -1;
        for (int i = 0; i < len; i++) {
            char c = arr.charAt(i);
            if (map.containsKey(c)) {
                l = Math.max(l, map.get(c));
            }
            map.put(c, i);
            maxx = Math.max(maxx, i - l);
        }
        return maxx;
    }
}
