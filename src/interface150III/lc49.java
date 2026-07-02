package interface150III;

import java.util.*;

/**
 * @author hc
 * @date
 **/
public class lc49 {
// todo 注意map。containkey是根据数据类型的equals进行判断的， 还有重写方法
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
//            判断是否出现过
            if (map.containsKey(key)) {
                map.getOrDefault(key, new ArrayList<>()).add(strs[i]);
            } else {
                map.put(key, new ArrayList<>());
                map.get(key).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        lc49 lc49 = new lc49();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        lc49.groupAnagrams(strs);
    }
}
