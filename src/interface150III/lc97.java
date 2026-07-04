package interface150III;

/**
 * @author hc
 * @date
 **/
public class lc97 {
// todo
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length();
        if (m + n != s3.length()) return false;

        boolean[][] dp = new boolean[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int k = i + j - 1;
                if (s3.charAt(k) == s2.charAt(j)) {
                    dp[i][j] = dp[i][j] || dp[i][j-1];
                } else if (s3.charAt(k) == s1.charAt(i)) {
                    dp[i][j] = dp[i][j] || dp[i-1][j];
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
