package leetcode.dynamic_planning;

import java.util.Arrays;

public class leetcode152 {
    public static int maxProduct(int[] nums) {

/*
1        你对问题的理解有误，题目要求找出乘积最大的非空连续子数组，而你的代码是在尝试找出以每个位置结尾的最大乘积，但没有考虑连续子数组的乘积可能来自多个位置的组合，且没有考虑负数的情况。
 2       初始化max变量为nums.length + 1比较随意，没有实际意义。
  3      没有考虑到可能出现的负数情况，因为负数乘以负数可能得到更大的乘积，所以需要同时维护一个当前的最小乘积，以便在遇到负数时进行转换。
*/

/*        if (nums.length == 1) {
            return nums[0];
        }

        int res = Integer.MIN_VALUE;
        int max = nums.length + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, 1);
        dp[0] = nums[0];
        for (int i = 1; i < max - 1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(nums[i], dp[j] * nums[i]);
            }
            res = Math.max(res, dp[i]);
        }

        return res;*/

        if (nums.length == 1) return nums[0];

        int res = nums[0];
        int maxProductEndingHere = nums[0];
        int minProductEndingHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tempMax = maxProductEndingHere;
//            计算以当前位置结尾的最大乘积
            maxProductEndingHere = Math.max(Math.max(nums[i], maxProductEndingHere * nums[i]), minProductEndingHere * nums[i]);
//            计算以当前位置结尾的最小乘积
            minProductEndingHere = Math.min(Math.min(nums[i], tempMax * nums[i]), minProductEndingHere * nums[i]);
            res = Math.max(res, maxProductEndingHere);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{0, 2, 3, -2, 4, 0}));
    }
}
