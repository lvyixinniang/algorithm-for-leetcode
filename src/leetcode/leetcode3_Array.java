package leetcode;

import java.util.HashSet;

public class leetcode3_Array {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len<2){
            return len;
        }

        HashSet<Character> s_set = new HashSet<>();
        char[] charArray = s.toCharArray();
        char charLast = charArray[len-1];
        int max = 0;
        for (char c : charArray) {
            if(s_set.contains(c)){
                max = Math.max(max,s_set.size());
                /*while(!s_set.isEmpty()){
                    s_set.
                }*/
                s_set.clear();
            }
            if (!s_set.contains(c)){
                s_set.add(c);
            }
        }
        if(s_set.contains(charLast)){
            max = Math.max(max,s_set.size());
                /*while(!s_set.isEmpty()){
                    s_set.
                }*/
            s_set.clear();
        }

        return max;
    }
}
