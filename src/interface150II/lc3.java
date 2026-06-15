package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc3 {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxlen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, right);
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        lc3 lc3 = new lc3();
        System.out.println(lc3.lengthOfLongestSubstring("abcabcbb"));
    }
}
