package interface150III;

import java.util.Arrays;

/**
 * @author hc
 * @date
 **/
public class lc45 {

    public int jump(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len]; // i 表示前i个， dp[i]的值代表到第i时，最短路径长度是多少
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j ++) {
                if (j + nums[j] >= i) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[len - 1];
    }

    public static void main(String[] args) {
        lc45 lc45 = new lc45();
        System.out.println(lc45.jump(new int[]{2,3,1,1,4}));
    }
}
