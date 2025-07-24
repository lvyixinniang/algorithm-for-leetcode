package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc3 {

    public int lengthOfLongestSubstring(String s) {
        // todo 还是对华东窗口不熟 2025/7/20(重做不会
        int len = s.length();
        int max = len == 0 ? 0 : 1;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < len; right++) {
            char c = s.charAt(right);
            if (map.containsKey(c) && map.get(c) >= left) {
                left = Math.max(left, map.get(c) + 1); // 移动左边界
            }
            map.put(c, right); // 更新字符位置
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        lc3 lc3 = new lc3();
        System.out.println(lc3.lengthOfLongestSubstring("pwwkew"));
    }
}
