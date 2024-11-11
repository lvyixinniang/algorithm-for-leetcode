package leetcode.Multidimensional_dynamic_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len == 1) return s;

        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        int startIndex = 0;
        int maxLen = 1;
        char[] charArray = s.toCharArray();

        for (int L = 2; L <= len; L++) {
            for (int i = 0; i < len; i++) {
                int j = i + L - 1;
                if (j >= len) break;

                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                }else {
                    if (L == 2) dp[i][j] = true;
                    else dp[i][j] = dp[i + 1][j - 1];
                }
                if (L > maxLen && dp[i][j]) {
                    maxLen = L;
                    startIndex = i;
                }
            }
        }

        return s.substring(startIndex, startIndex + maxLen );
    }
}
