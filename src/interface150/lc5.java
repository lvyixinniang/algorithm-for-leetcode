package interface150;

public class lc5 {

    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len == 1) return s;

        int maxlen = 1;
        int start = 0;
        // dp[i][j] 表示s[i..j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        // 长度为1 的必定是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();
        for (int L = 2; L <= len; L++) {
            // 枚举左边界， 左边界的上限设置可以宽松一些
            for (int i = 0; i < len; i++) {
                // 由 L 和 i 可以确定右边界 ， 即j - i + 1 = L
                int j = i + L - 1;
                if (j >= len) break;

                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j] && j -i + 1 > maxlen) {
                    maxlen = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start, start + maxlen);
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }
}
