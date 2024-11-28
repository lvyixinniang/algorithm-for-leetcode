package Code_Capriccio.HashTable;

import java.util.HashMap;
import java.util.Map;

public class lc242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        // 桶记录
        int[] stong = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stong[c - 'a']++;
        }
        int[] ttong = new int[26];
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            ttong[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (stong[i] != ttong[i]) {
                return false;
            }
        }

        return true;
    }
}
