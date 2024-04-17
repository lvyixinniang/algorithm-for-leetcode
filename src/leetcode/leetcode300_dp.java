package leetcode;

public class leetcode300_dp {
    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        int max = lengthOfLIS(nums);
        System.out.println(max);
    }
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        int max = 1;
        for (int i = 1; i < n; i++) {
            dp[i] =1;
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j]){
                  dp[i] =  Math.max(dp[i] , dp[j] + 1);
                }
            }
            max = Math.max(max,dp[i]);
        }

        return max;
    }
}
