package interface150II;

import java.util.*;

public class lc49 {
    public List<List<String>> groupAnagrams(String[] strs) {
//        todo HashMap的一些使用方法
//        排序法
/*        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());*/

//        避免排序方法
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] count = new char[26];
            for (char c : str.toCharArray()) count[c - 'a']++;
            String key = Arrays.toString(count);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        lc49 lc49 = new lc49();
        System.out.println(lc49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
