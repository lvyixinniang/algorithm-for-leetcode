package interface150;

public class Java16 {

    public int maxProfit (int[] prices) {
        // 买卖两次， 需要使用三元数组
        if (prices.length == 0) return 0;

        // 0 表示不持有， 1表示持有
        // dp[天数][交易次数][持有状态]
        int[][][] dp = new int[prices.length][3][2];

        // 初始化
        for (int i = 0; i <= 2; i++) {
            // 不持有的时候 为 0
            dp[0][i][0] = 0;
            // 持有的时候， 为第一天的值
            dp[0][i][1] = -prices[0];
        }

        for (int i = 1; i < prices.length; i++) {
            for (int j = 0; j <= 2; j++) {
                // 交易0次
                if (j == 0) {
                    // 不可能的值 赋值为 MIN——VALUE
                    dp[i][j][1] = Integer.MIN_VALUE;
                    dp[i][j][0] = 0;
                    continue;
                }
                // 昨天不持有 和 昨天持有 + 今天卖出
                dp[i][j][0] = Math.max(dp[i-1][j][0], dp[i-1][j][1] + prices[i]);
                // 昨天持有 和 昨天不持有 + 今天 购入
                dp[i][j][1] = Math.max(dp[i-1][j][1], dp[i-1][j-1][0] - prices[i]);
            }
        }
        return dp[prices.length-1][2][0];
    }

    public static void main(String[] args) {
        Java16 java16 = new Java16();
        System.out.println(java16.maxProfit(new int[]{3,5,7,2,4}));
    }
}
