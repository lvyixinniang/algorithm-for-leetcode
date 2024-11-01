package leetcode.dynamic_planning;

import java.util.Arrays;

public class leetcode416 {
    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{1, 5, 11, 5}));
    }
//    0 - 1 背包的 变体
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) return false;
        int target = sum / 2; // 唉 ， 一开始没想到 总值是 可以直接得到
        boolean[][] dp = new boolean[nums.length + 1][target + 1];
        for (int i = 0; i <= nums.length; i++) {
            dp[i][0] = true;
        }
//        循环遍历nums 数组中的每一个元素
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= target; j++) {
//                这一步先不考虑当前第 i 个数，如果前 i - 1 个数能组成和为 j true
                dp[i][j] = dp[i - 1][j];
                if (j >= nums[i - 1]) {
//  状态转移方程 dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i -1]]
//  如果不选当前数 nums[i - 1]，那么状态和上一步一样，即 dp[i][j] = dp[i - 1][j]
//  如果选当前数 nums[i - 1]，那么就要看前 i - 1 个数能否组成和为 j - nums[i - 1]
                    dp[i][j] = dp[i][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        return dp[nums.length][target];
    }
}
