package interface150III;

import java.util.HashMap;

/**
 * @author hc
 * @date
 **/
public class lc3 {
// todo
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int size = 0;
        int l = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) >= l) {
                l = map.get(c) + 1;
            }
            map.put(c, i);
            size = Math.max(size, i - l + 1);
        }
        return size;
    }

    public static void main(String[] args) {
        lc3 lc3 = new lc3();
        System.out.println(lc3.lengthOfLongestSubstring("aab"));
    }
}
