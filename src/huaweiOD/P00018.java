package huaweiOD;

import java.util.Scanner;

/**
 * @author hc
 * @date
 **/
public class P00018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        int[][] dp = new int[n][3];
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for (int i = 1; i < n; i ++) {
            for (int j = 0; j < 3; j ++) {
                if (j == 0)
                    dp[i][j] = arr[i][j] + Math.min(dp[i-1][1], dp[i-1][2]);
                else if(j == 1)
                    dp[i][j] = arr[i][j] + Math.min(dp[i-1][0], dp[i-1][2]);
                else
                    dp[i][j] = arr[i][j] + Math.min(dp[i-1][0], dp[i-1][1]);
            }
        }

        int min = Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));
        System.out.println(min);
    }
}
