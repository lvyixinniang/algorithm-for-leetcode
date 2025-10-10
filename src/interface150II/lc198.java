package interface150II;

public class lc198 {

    public int rob(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][2]; // 0-不偷 1-偷
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0] + nums[i];
        }

        return Math.max(dp[n - 1][0], dp[n - 1][1]);
    }

    public static void main(String[] args) {
        lc198 lc198 = new lc198();
        System.out.println(lc198.rob(new int[]{1,2,3,1}));
    }
}
