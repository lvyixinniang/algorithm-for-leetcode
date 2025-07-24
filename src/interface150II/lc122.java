package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc122 {
    public int maxProfit(int[] prices) {
        // todo 待做2025/7/2 2025/7/19二做
        // 法一：贪心
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int tmp = prices[i] - prices[i - 1];
            if (tmp > 0) profit += tmp;
        }
        return profit;

        // 法二： 动态规划
        // 认定当前是 最小值
        // 0 - 持有 1 - 不持有
/*        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            // 今天不持有 ： 昨天不持有并且今天不购买 、 昨天持有并今天卖出
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);

            // 今天持有 ： 昨天持有并今天不卖 、 昨天不持有+今天买入
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return Math.max(dp[prices.length - 1][0], dp[prices.length - 1][1]);*/
    }
}
