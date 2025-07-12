package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc290 {

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] str = s.split(" ");
        if (pattern.length() != str.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String val = str[i];
            if (!map.containsKey(c) && !map.containsValue(val)) {
                map.put(c, val);
            } else if (map.containsKey(c) && (!map.get(c).equals(val))) {
//                这种 A--B ，但 A--C
                return false;
            } else if (map.containsValue(val) && (!map.containsKey(c) || (map.containsKey(c) && !map.get(c).equals(val)))) {
//                A--B ， 但 C--B
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lc290 obj = new lc290();
        System.out.println(obj.wordPattern("abba", "dog cat cat dog"));
    }
}
