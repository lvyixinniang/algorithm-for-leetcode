package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc3 {

    public int lengthOfLongestSubstring(String s) {
        // todo 还是对华东窗口不熟
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1; // 更新左边界
            }
            map.put(c, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        lc3 lc3 = new lc3();
        System.out.println(lc3.lengthOfLongestSubstring("pwwkew"));
    }
}
