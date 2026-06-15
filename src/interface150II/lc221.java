package interface150II;

public class lc221 {

    public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];
        int maxx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1'){
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                        maxx = Math.max(maxx, 1);
                    } else {
                        // (1,1)这种位置
                        if (dp[i - 1][j - 1] >= 1 && dp[i - 1][j] >= 1
                                && dp[i][j - 1] >= 1) {
                            dp[i][j] = Math.min(dp[i-1][j-1],
                                    Math.min(dp[i-1][j], dp[i][j-1]))+1;
                        } else {
                            dp[i][j] = 1;
                        }
                        maxx = Math.max(dp[i][j], maxx);
                    }
                }
            }
        }
        return maxx * maxx;
    }

    public static void main(String[] args) {
        lc221 solution = new lc221();
        int[][] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
//        System.out.println(solution.maximalSquare(matrix));
    }
}
