package interface150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lc3 {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        char[] charArray = s.toCharArray();
        int l = 0;
        for (int r = 0; r < charArray.length; r++) {
            char c = charArray[r];
            if (!set.contains(c)) {
                set.add(c);
                if (set.size() > max) {
                    max = set.size();
                }
            } else {
                while (set.contains(charArray[r])) {
                    set.remove(charArray[l++]);
                }
                if (!set.contains(charArray[r])) {
                    set.add(charArray[r]);
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" 123456"));
        System.out.println(lengthOfLongestSubstring("abb"));
    }
}
