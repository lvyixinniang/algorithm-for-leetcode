package interface150II;

public class lc72 {


    public int minDistance(String w1, String w2) {
        int m = w1.length(), n = w2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            dp[i][0] = i;
        }

        for (int i = 0; i < n + 1; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
               if (w1.charAt(i - 1) == w2.charAt(j - 1)) {
                   dp[i][j] = dp[i - 1][j - 1];
               } else {
                   int replace = dp[i][j - 1] + 1;
                   int delete = dp[i - 1][j] + 1;
                   int insert = dp[i - 1][j - 1] + 1;
                   dp[i][j] = Math.min(replace, Math.min(delete, insert));
               }
            }
        }
        return dp[m][n];
    }
}
