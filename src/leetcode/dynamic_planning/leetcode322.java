package leetcode.dynamic_planning;

import java.util.Arrays;

public class leetcode322 {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{2}, 3));
    }

    public static  int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i)
                dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
            }
        }
        return dp[amount] > amount  ? -1 : dp[amount];
    }
}
