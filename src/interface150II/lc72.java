package interface150II;

public class lc72 {

//    todo 经典腾讯面试题
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        if (m == 0 || n == 0) return m == 0 ? n : m;

        int[][] dp = new int[m + 1][n + 1];

        // 先初始化 i，0 即从word1 到word2
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1; // 全部删除
        }
        // 0， i
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1; // 全部新增
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    // 相等
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // 不等
                    int insert = dp[i - 1][j] + 1;
                    int delete = dp[i][j - 1] + 1;
                    int replace = dp[i - 1][j - 1] + 1;
                    dp[i][j] = Math.min(insert, Math.min(delete, replace));
                }
            }
        }
        return dp[m][n];
    }
}
