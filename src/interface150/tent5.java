package interface150;

public class tent5 {
    public int minEditCost (String str1, String str2, int ic, int dc, int rc) {
        // write code here
        int n = str1.length(), m = str2.length();
        if (n * m == 0) {
            return (n + m) * Math.min(dc, ic);
        }
        int[][] dp = new int[n + 1][m + 1];
        // cong str1 dao ""
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i * dc;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j * ic;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int left = dp[i][j - 1] + dc;
                int down = dp[i - 1 ][j] + ic;
                int left_down = dp[i - 1][j - 1];
                if (str1.charAt(i - 1) != str2.charAt(j - 1)) {
                    left_down += rc;
                }
                dp[i][j] = Math.min(left, Math.min(left_down, down));
            }
        }
        return dp[n][m];
    }
}
