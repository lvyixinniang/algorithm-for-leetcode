package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc205 {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        int m = s.length(), n = t.length();
        if (m != n) return false;
        for (int i = 0; i < m; i++) {
            if (!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if ((map.containsKey(s.charAt(i)) && t.charAt(i) != map.get(s.charAt(i)))
                        || (!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i)))
                        || (map.containsValue(t.charAt(i)) && !map.containsKey(s.charAt(i)))
                ) return false;
            }
        }
        return true;
    }
}
