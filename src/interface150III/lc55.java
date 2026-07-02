package interface150III;

/**
 * @author hc
 * @date
 **/
public class lc55 {

    public boolean canJump(int[] nums) {
        int len = nums.length;
        boolean[] dp = new boolean[len + 1];
        for (int i = 1; i < len; i++) {
            for (int j = 0; j <= i; j ++) {
                if (dp[j] && j + nums[j] >= i) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }
}
