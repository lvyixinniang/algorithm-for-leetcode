package interface150;

public class lc221 {

    public int maximalSquare(char[][] matrix) {
        int maxSize = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return maxSize;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int[][] dp = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                        maxSize = Math.max(maxSize, dp[i][j]);
                    }
                }

            }
        }
        int maxSquare = maxSize * maxSize;
        return maxSquare;
    }
    public static void main(String[] args) {
        char[][] matrix = new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        lc221 solution = new lc221();
        System.out.println(solution.maximalSquare(matrix));
    }
}
