package leetcode.Multidimensional_dynamic_programming;

import java.util.Arrays;

public class leetcode64 {
    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }
    public static  int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
         int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i - 1 != 0 && j - 1 != 0) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1] ) + grid[i - 1][j - 1];
                } else if (i - 1 == 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i - 1][j - 1];
                }else if (j - 1 == 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i - 1][j - 1];
                }
            }
        }

         return dp[m][n];
    }
}
