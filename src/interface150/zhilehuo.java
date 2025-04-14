package interface150;

import java.util.*;

public class zhilehuo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("grape");
        list.add("grape");
        // 去重
        quchong(list);
        // 查找 年龄最大三人
        Map<String, Integer> map = new HashMap<>();
        map.put("john", 35);
        map.put("bob", 40);
        map.put("alice", 30);
        map.put("tom", 45);
        map.put("jerry", 45);
        searchMaxThree(map);
        // list2Map
        list2Map(list);
        // listPrall
        List<String> list1 = new ArrayList<>();
        listPrall(list1);

        // zhongweishu
        Map<String, List<Integer>> map1 = new HashMap<>();
        midNumber(map1);
        // reverseMap
        List<String> list2 = new ArrayList<>();
        reverseMap(list2);

    }

    private static Map reverseMap(List<String> list2) {
        Map<String, String> map = new HashMap<>();
        for (String s : list2) {
            String[] split = s.split(",");
            map.put(split[1], split[0]);
        }
        return map;
    }

    private static Map midNumber(Map<String, List<Integer>> map1) {
        Map<String, Double> map = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : map1.entrySet()) {
            Double midNum = 0.0;
            for (Integer num : entry.getValue()) {
                midNum += num;
            }
            midNum = midNum / entry.getValue().size();
            map.put(entry.getKey(), midNum);
        }
        return map;
    }

    private static void listPrall(List<String> list1) {
        List<String> numbers = new ArrayList<>();
        List<String> Ads = new ArrayList<>();

        for (String s : list1) {
            char c = s.charAt(0);
            if (c <= '9' && c >= '0') {
                numbers.add(s);
            }else {
                Ads.add(s);
            }
        }
        for (String number : numbers) {
            System.out.println(number);
        }
        for (String ad : Ads) {
            System.out.println(ad);
        }
    }

    private static Map list2Map(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }

    private static void searchMaxThree(Map<String, Integer> map) {
        Object[] array = map.values().toArray();
        Arrays.sort(array);
        int len = array.length;
        for (int i = len - 1; i >= len - 3; i--) {
            for (String s : map.keySet()) {
                if (map.get(s) == array[i]) {
                    System.out.println(s);
                    map.remove(s);
                    break;
                }
            }
        }
    }

    private static void  quchong (List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
    }
}
