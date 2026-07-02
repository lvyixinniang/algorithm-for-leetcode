package interface150III;

/**
 * @author hc
 * @date
 **/
public class lc122 {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0) return 0;
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < len; i++) {
            // 这次没买
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            // 这次买
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
        }
        return dp[len-1][0] >= dp[len-1][1] ? dp[len-1][0] : dp[len-1][1];
    }
}
