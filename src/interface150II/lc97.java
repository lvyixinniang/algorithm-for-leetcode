package interface150II;

public class lc97 {
//  todo 没思路, 有答案，我都没看懂，有点懂了，类似机器人走迷宫，可以有s1,s2两种选择 9/18重做 9/22
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length(), m = s2.length(), t = s3.length();
        if (n + m != t) return false;
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                int p = i + j - 1;
                // s1 中前i个 + s2 中前j个
                if (i > 0) {
                    dp[i][j] = dp[i][j]
                            || (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(p));
                }
                if (j > 0) {
                    dp[i][j] = dp[i][j]
                            || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(p));
                }

            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        lc97 is = new lc97();
        System.out.println(is.isInterleave(s1, s2, s3));
    }
}
