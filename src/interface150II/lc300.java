package interface150II;

import java.util.Arrays;

public class lc300 {

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int maxx = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxx = Math.max(maxx, dp[i]);
        }
        return maxx;
    }

    public static void main(String[] args) {
        lc300 lc300 = new lc300();
        System.out.println(lc300.lengthOfLIS(new int[] { 0 }));
    }
}
