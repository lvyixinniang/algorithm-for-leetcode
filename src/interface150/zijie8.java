package interface150;

public class zijie8 {

    public int minEditCost (String str1, String str2, int ic, int dc, int rc) {
        // write code here
        // 相当于 只有 插入 ， 替换
        int n = str1.length(), m = str2.length();
        if (n * m == 0) {
            return (n + m) * Math.min(dc, ic);
        }
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i * ic;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j * ic;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int left = dp[i - 1][j] + dc;
                int down = dp[i][j - 1] + ic;
                int left_down = dp[i - 1][j - 1];
                if (str1.charAt(i - 1) != str2.charAt(j - 1)) {
                    left_down += rc;
                }
                dp[i][j] = Math.min(left, Math.min(down, left_down));
            }
        }
        return dp[n][m];
    }
}
