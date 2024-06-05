package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode53_Array {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,-2};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        if(len<=1){
            return len==0?0:nums[0];
        }
        /*if(len==2&& nums[1]<0 && nums[1]<0){
            return nums[0]>nums[1]?nums[0]:nums[1];
        }*/
//        此程序没法解倒序的数组如 [-1,-2] , [1,-1,-2]
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        int[] dp = new int[len];
        Arrays.fill(dp,0);
        dp[0] = nums[0];
//        int sum =0;
//        将max = nums[0] 可解决倒序问题
        int max=nums[0];
        for(int i=1 ;i<len; i++){
//            sum+= nums[i-1];
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max = max<dp[i]?dp[i]:max;
        }

        return max;
    }
}
