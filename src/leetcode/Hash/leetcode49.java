package leetcode.Hash;

import java.util.*;

public class leetcode49 {
//    这里的难点 , 就是 没有思路 , 将相同的东西放入list<list<String>>


//    charArray.toString() 返回的是数组的引用信息，不是字符数组组成的字符串。
//    new String(charArray) 返回的是由字符数组组成的字符串，这才是您需要的。

    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<String,List<String>> map = new HashMap<>();
//        for (String str : strs) {
//            char[] charArray = str.toCharArray();
//            Arrays.sort(charArray);
////            String string = charArray.toString();
//            String string = new String(charArray);
//            if (map.containsKey(string)) {
//                map.get(string).add(str);
//            }else {
//                List<String> list = new ArrayList<>();
//                list.add(str);
//                map.put(string,list);
//            }
//        }
//
//        return new ArrayList<>(map.values());

        Map<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String string = new String(charArray);
            List<String> list = map.getOrDefault(string,new ArrayList<String>());
            list.add(str);
//            实际上每次 put 都更新了相同的键所对应的值
//            这是因为您在每次 put 之前都获取了该键对应的列表（如果没有则创建一个新的列表）
//            ，然后向这个列表添加新的值，最后再把这个更新过的列表放回 map 中。
            map.put(string,list);
        }

        return new ArrayList<>(map.values());
    }
}
