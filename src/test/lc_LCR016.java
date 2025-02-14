package test;

import java.util.HashSet;
import java.util.Set;

public class lc_LCR016 {


    public static  int lengthOfLongestSubstring(String s) {
        // 双指针
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int l=0;
        int max=0;
        for(int r=0;r<n;r++){
            char c= s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
