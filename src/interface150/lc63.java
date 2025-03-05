package interface150;

public class lc63 {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        dp[1][1] = obstacleGrid[0][0] == 1 ? 0 : 1;
        // 如果初始值都是 障碍物 ，不可能有路线
        if (dp[1][1] == 0) return 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 && j == 1) {continue;}
                if (obstacleGrid[i - 1][j - 1] == 1) {
                    dp[i][j] = 0;
                }else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }
}
