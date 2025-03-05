package interface150;

import java.util.*;

public class lc49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(new String(sorted))) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sorted, list);
            } else {
                List<String> strings = map.get(sorted);
                strings.add(str);
                map.put(sorted, strings);
            }
        }
        map.forEach((m, list) -> {
            boolean add = res.add(list);
        });
        return res;
    }
    public static void main(String[] args) {
        lc49 lc49 = new lc49();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = lc49.groupAnagrams(strs);
    }
}
