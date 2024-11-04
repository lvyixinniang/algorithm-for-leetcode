package leetcode.Multidimensional_dynamic_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode5 {

    public String longestPalindrome(String s) {
        int len = s.length();
        String res = "";
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            List<Integer> integers = map.getOrDefault(c, new ArrayList<>());
            integers.add(i);
            map.put(c, integers);
        }

        for (List<Integer> integers : map.values()) {
            if (integers.size() >= 2) {
                
            }
        }


        return res;
    }
}
