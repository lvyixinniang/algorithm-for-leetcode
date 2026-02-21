package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc3 {

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxx = 0;
        int len = s.length();
        if (len == 0) return 0;
        Map<Character, Integer> map = new HashMap<>(); //k, value索引
        for (int right = 0; right < len; right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                int c_index = map.get(c);
                if (c_index < left) {
                    // 不在范围内
                    map.put(c, right);
                } else {
                    maxx = Math.max(maxx, right-left);
                    left = map.get(c) + 1;
                    map.put(c, right);
                }
            } else {
                map.put(c, right);
            }
            maxx = Math.max(maxx, right-left + 1);
        }
        return maxx;
    }

    public static void main(String[] args) {
        lc3 lc3 = new lc3();
        System.out.println(lc3.lengthOfLongestSubstring(" "));
    }
}
