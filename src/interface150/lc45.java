package interface150;

import java.util.Arrays;

public class lc45 {

    public static int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // 第一台阶， 不需要跳
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length && j <= i + nums[i]; j++) {
                dp[j] = Math.min(dp[j], dp[i] + 1);
            }
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
    }
}
