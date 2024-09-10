package leetcode.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;

public class leetcode3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("acbbbbbb"));
    }
    public static  int lengthOfLongestSubstring(String s) {
/*        if (s.length() < 2) {
            return s.length()==1? 1: 0;
        }

        int l = 0, r = 1;
        int window = 1;
        int n = s.length();
        char[] charArray = s.toCharArray();
        for (l = 0; l < n-1 && r < n; l++) {
            r = l + 1;
            int sum = 2;
            int[] english = new int[1000];
            Arrays.fill(english,0);
            int x = charArray[l] - 'a' + 100;
            english[x]++;
            while (r < n && charArray[l] != charArray[r]) {
                int index = charArray[r] - 'a'+ 100;
                english[index]++;
                if (english[index] > 1){
                    break;
                }
                r++;
                window = Math.max(window,sum);
                sum ++;
            }
        }
        return window;*/

        if (s.length() < 2) {
            return s.length()==1? 1: 0;
        }

//        TODO 这个算法 是把 最长子字符串的问题 转化为 两个重复字符间的距离的 最大值

//        KeyUIndex 维护的 是  key是 字符 , value是 字符最近出现的 索引
        HashMap<Character, Integer> keyIndex = new HashMap<>();
        int length = s.length();
//        String 中 最后唱的 无重复子字符串的  长度
        int maxLength = 1;
//        lastIndex 是上次出现 的索引值
        int lastIndex = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
//            这应该是通过 哈希来快速 收敛左边界
            if (keyIndex.containsKey(c)) {
                lastIndex = Math.max(keyIndex.get(c) + 1, lastIndex);
            }
//            这里使用了 Map的 get之后 ,在put 就是更新Map的值的特性
            keyIndex.put(c, i);
//            现在 子字符串的 长度
            int currLength = i - lastIndex + 1;
            if (maxLength < currLength) {
                maxLength = currLength;
            }
        }
        return maxLength;
    }
}
