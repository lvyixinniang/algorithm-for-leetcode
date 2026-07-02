package huaweiOD;

import java.util.Scanner;

/**
 * @author hc
 * @date
 **/
public class P00006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = sc.nextInt();
        // 01背包
        int[][] dp = new int[n + 1][T + 1];
        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            int w = sc.nextInt();
            // 遍历全部情况
            for (int j = 0; j <= T; j ++) {
                // 不选当前工作
                dp[i][j] = dp[i-1][j];
                // 如果容量够
                if (j >= t) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j] + w);
                }
            }
        }
        System.out.println(dp[n][T]);
    }
}
