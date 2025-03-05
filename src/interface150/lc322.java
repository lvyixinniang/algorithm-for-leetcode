package interface150;

import java.util.Arrays;

public class lc322 {

    public static int coinChange(int[] coins, int amount) {
        int maxx = amount + 1;
        int[] dp = new int[maxx];
        Arrays.fill(dp, maxx);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
//        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(coinChange(new int[]{2}, 3));
//        System.out.println(coinChange(new int[]{1}, 0));
//        System.out.println(coinChange(new int[]{186,419,83,408}, 6249));
    }
}
