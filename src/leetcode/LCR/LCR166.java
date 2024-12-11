package leetcode.LCR;

public class LCR166 {
    public static void main(String[] args) {
        int[][] frame = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(jewelleryValue(frame));
    }
    public static int jewelleryValue(int[][] frame) {
        int n = frame.length;
        int m = frame[0].length;
        if (n == 0 && m == 0) return frame[0][0];
        int[][] dp = new int[n][m];
        dp[0][0] = frame[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }else if(i == 0) {
                    dp[i][j] = frame[i][j] + dp[0][j - 1];
                }else if (j == 0) {
                    dp[i][j] = frame[i][j] + dp[i - 1][0];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]) + frame[i][j];
                }
            }
        }
        return dp[n-1][m-1];
    }
}
