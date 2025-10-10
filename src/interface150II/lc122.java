package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc122 {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2]; // 0 不买， 1 购买
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            // 不买：前一天购买，今天卖出
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            // 买
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[prices.length - 1][0] >= dp[prices.length - 1][1]
                ? dp[prices.length - 1][0] : dp[prices.length - 1][1];
    }
}
