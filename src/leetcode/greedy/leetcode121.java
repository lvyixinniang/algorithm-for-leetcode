package leetcode.greedy;

public class leetcode121 {

    public int maxProfit(int[] prices) {
//        一次 遍历 算法
        int low = Integer.MAX_VALUE;
        int res = 0;
        int len = prices.length;

        for (int i = 0; i < len; i++) {
//            求当前之前的 历史最低点
            if (low > prices[i]) {
                low = prices[i];
            }
            res = Math.max(res , prices[i] - low);
        }

        return res;
    }
}
