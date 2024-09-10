package leetcode.SlidingWindow;

import java.util.*;

public class leetcode438 {
    public static void main(String[] args) {
        System.out.println(findAnagrams("aa", "bb"));
    }
    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> indexs = new ArrayList<>();
        int window = p.length();
        char[] charArray = s.toCharArray();
        int n = charArray.length;

        int[] eglish = new int[26];
        Arrays.fill(eglish,0);

        for (int i = 0; i < window; i++) {
            int x = p.charAt(i) - 'a';
            eglish[x]++;
        }

        for (int i = 0; i < n; i++) {
            int x = charArray[i] - 'a';
            if (eglish[x] > 0) {
                eglish[x]--;
            }
        }

        return indexs;
    }
}
