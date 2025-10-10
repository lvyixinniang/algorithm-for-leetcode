package interface150II;

public class lc63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j && i == 1 && obstacleGrid[i-1][j-1] != 1) {
                    dp[i][j] = 1;
                    continue;
                }

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
        lc63 lc63 = new lc63();
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(lc63.uniquePathsWithObstacles(obstacleGrid));
    }
}
