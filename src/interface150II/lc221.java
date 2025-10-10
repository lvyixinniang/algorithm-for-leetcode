package interface150II;

public class lc221 {

    public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];
        int maxSide = 0;

        // 先处理第一行和第一列
        for (int i = 0; i < m; i++) {
            dp[i][0] = matrix[i][0] == '0' ? 0 : 1;
            maxSide = Math.max(maxSide, dp[i][0]);
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = matrix[0][i] == '0' ? 0 : 1;
            maxSide = Math.max(maxSide, dp[0][i]);
        }


        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }
        return maxSide * maxSide;
    }

    public static void main(String[] args) {
        lc221 solution = new lc221();
        int[][] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
//        System.out.println(solution.maximalSquare(matrix));
    }
}
