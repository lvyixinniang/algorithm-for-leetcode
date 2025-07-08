package interface150II;

public class lc122 {
    public int maxProfit(int[] prices) {
        // todo 待做2025/7/2
        // 0 —— 不持有 ， 1 —— 持有
        int len = prices.length;
        int[][] dp = new int[len][2];
        dp[0][0] = 0; // 第一天 不持有股票
        dp[0][1] = -prices[0]; // 第一天， 持有股票
        for (int i = 1; i < len; i++) {
            // 今天 不持有 股票
            // 1.昨天不持有，今天不买入 、 2. 昨天持有，今天卖出
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            // 今天持有
            // 1.昨天不持有，今天买入。 2.昨天持有，今天不买入
            dp[i][1] = Math.max(dp[i - 1][0]-prices[i], dp[i - 1][1]);
        }
        return Math.max(dp[len - 1][0], dp[len - 1][1]);
    }
}
