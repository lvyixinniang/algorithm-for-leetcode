package interface150II;

public class lc97 {
//    todo 2026/4/17 不会
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length(), m = s2.length(), len = s3.length();
        if (n + m != len) return false;
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                int index = i + j;
                if (i == 0 && j == 0) continue;
                if (i > 0) {
                    dp[i][j] = dp[i][j] || (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(index - 1));
                }
                if (j > 0) {
                    dp[i][j] = dp[i][j] || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(index - 1));
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
