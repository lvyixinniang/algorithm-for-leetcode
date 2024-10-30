package leetcode.dynamic_planning;

import java.util.*;

public class leetcode300 {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
    public static int lengthOfLIS(int[] nums) {
        int max = nums.length + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, 1);
        int maxx = 1;
        for (int i = 1; i < max - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i])
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            maxx = Math.max(dp[i], maxx);
        }

        return maxx;
    }
}
