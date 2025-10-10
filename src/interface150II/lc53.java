package interface150II;

public class lc53 {

//    todo 不会 9月5日重做(一开始想法不是动态规划
    public int maxSubArray(int[] nums) {
        // 动态规划
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
