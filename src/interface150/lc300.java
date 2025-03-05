package interface150;

import java.util.Arrays;

public class lc300 {

    public static int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        dp[0] = 1;
        int maxx = 0;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxx = Math.max(maxx, dp[i]);
                }
            }
        }
        return maxx;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6}));
    }
}
