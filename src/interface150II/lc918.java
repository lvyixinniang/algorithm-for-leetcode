package interface150II;

import java.util.Arrays;

public class lc918 {
//  todo 没有做出来
    public int maxSubarraySumCircular(int[] nums) {
        int len = nums.length;
        int totalsum = 0;
        int currntMax = 0, maxSum = nums[0]; // 最大子数组和
        int currentMin = 0, minSum = nums[0]; // 最小子数组和

        for (int num : nums) {
            totalsum += num;
            // 计算最大子数组和 （kadane）
            currntMax = Math.max(currntMax + num, num);
            maxSum = Math.max(maxSum, currntMax);

            // 计算最小子数组和
            currentMin = Math.min(currentMin + num, num);
            minSum = Math.min(minSum, currentMin);
        }
//        处理全是负数情况
        if (maxSum < 0) return maxSum;
        return Math.max(maxSum, totalsum - minSum);
    }

    public static void main(String[] args) {
        lc918 lc918 = new lc918();
        int[] nums = {5,-3,5};
        lc918.maxSubarraySumCircular(nums);
    }
}
