package leetcode.SlidingWindow;

import java.util.*;

public class leetcode438 {
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }
    public static List<Integer> findAnagrams(String s, String p){
/*
//        TLE了
        List<Integer> indexs = new ArrayList<>();
        int window = p.length();
        char[] charArray = s.toCharArray();
        int n = charArray.length;

        Map<Character,Integer> judge = new HashMap<>();
//        将 p 中的值 存入 judge中 a,b,c - > {0,1,2}
        for (int i = 0; i < window; i++) {;
            judge.put(charArray[i],i);
        }

        for (int i = 0; i < n; i++) {
            if (judge.containsKey(charArray[i])) {
                Map<Character,Integer> jd = new HashMap<>();
                for (int j = 0; j < window; j++) {;
                    jd.put(charArray[j],j);
                }
                for (int j = i;j < n && j < i + window; j++) {
                    if (jd.containsKey(charArray[j])) {
//                        这个是 sb ArrayList 有个重载 remove 经常识别错 , 加"aaaa",是防止这个现象
                        jd.remove(charArray[j]);
                    }
                }
                if (jd.size() == 0) {
                    indexs.add(i);
                }
            }
        }
        return indexs;*/

        List<Integer> res = new ArrayList<>();
        int np = p.length(), ns = s.length();
        if (ns < np) {
            return res;
        }
        final int[] target = count(p, 0, np);
        final int[] sCount = count(s, 0, np - 1);
        for (int i = 0; i < ns - np + 1; i++) {
//            移动 右指针 添加右参数
            ++sCount[s.charAt(i + np - 1) - 'a'];
            if (Arrays.equals(target, sCount)) {
                res.add(i);
            }
//            移动 左指针 删除左参数
            --sCount[s.charAt(i) - 'a'];
        }
        return res;
    }
//    方便 每次记录26 位 的数量
    public static int[] count(String s, int start, int end) {
        int[] res = new int[26];
        for (int i = 0; i < end; i++) {
            final int c = s.charAt(i) -'a';
            res[c] ++;
        }
        return res;
    }
}
