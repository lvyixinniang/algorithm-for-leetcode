package interface150II;

public class lc72 {

    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int insert = dp[i - 1][j] + 1;
                int delete = dp[i][j - 1] + 1;
                int replace = dp[i - 1][j - 1] + 1;
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    replace = dp[i -1][j - 1];
                }
                dp[i][j] = Math.min(insert, Math.min(delete, replace));
            }
        }
        return dp[n][m];
    }

}
