package interface150II;

public class lc198 {

    public int rob(int[] nums) {
        int[][] dp = new int[nums.length][2];
        // 1 是偷 ； 0 是不偷
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // 当前不偷 上一次不偷 或者 上次不偷
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            // 本次偷 = 上次不偷+本次 或者 上次偷
            dp[i][1] = Math.max(dp[i - 1][0] + nums[i], dp[i - 1][1]);
        }
        return Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
    }

    public static void main(String[] args) {
        lc198 lc198 = new lc198();
        System.out.println(lc198.rob(new int[]{1,2,3,1}));
    }
}
