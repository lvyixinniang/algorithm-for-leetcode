package leetcode;

import java.util.*;

public class leetcode438_array {

    /*public static void main(String[] args) {
        String s,p;
        s = "aab";
        p = "aa";
        System.out.println(findAnagrams(s, p));
    }*/

    // 错误代码,没有考虑全 数据结构的问题 使用SET数据结构将会有一个数据不重复问题 , if p是含有重复字符的字符串
    /**
     * 关于这点, 我在看测试样例时没想到这个问题 , 需要自己想到
     */

    /* public static List<Integer> findAnagrams(String s, String p) {
        // 构建散列表 使用Set数据结构, 做一个去重
        Set<Character> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            set.add(p.charAt(i));
        }
        for (int i = 0; i < (s.length()-p.length()+1); i++) {
//            if(i!=0){
//            }
            int j =i;
            while(set.contains(s.charAt(j)) && (j-i)<p.length()){
                set.remove(s.charAt(j));
                if(j+1-i == p.length()){
                    list.add(i);
                }
                j++;
                if(j==s.length()){
                    break;
                }
            }
            for (int i1 = 0; i1 < p.length(); ++i1) {
                set.add(p.charAt(i1));
            }
        }

        return list;
    }*/

    public List<Integer> findAnagrams(String s, String p){
        int slen = s.length(),plen = p.length();

        if (slen<plen){
            return new ArrayList<Integer>();
        }

        List<Integer> ans = new ArrayList<Integer>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];

        for(int i =0; i<plen; ++i){
            ++sCount[s.charAt(i)-'a'];
            ++pCount[p.charAt(i)-'a'];
        }

        if(Arrays.equals(sCount,pCount)){
            ans.add(0);
        }

        for (int i = 0; i < slen - plen; ++i) {
            // 69和70行代码 ,没理解到
            // 开始初始化 那里已经将 plen 长度的数据桶排进scount中了 ,
            // 所以, i移动时 ,需要 先数据清除掉该i的
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i + plen) - 'a'];

            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}
