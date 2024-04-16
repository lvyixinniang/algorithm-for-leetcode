import java.util.Arrays;

public class leetcode673_dp {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,3,5,4,7,2};
        int sum = findNumberOfLIS(nums);
        System.out.println(sum);
    }
    public static  int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        } else if (n==1) {
            return 1;
        }

        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[j]+1 , dp[i]);
                }
            }
        }
        Arrays.sort(dp);
        int sum =0;
        int maxSecond = dp[n-2];
//        不论是最大值,还是最小值,我当前都是有缺陷的
//        最大值缺陷: 最大值一个,而第二大的值有多个时
//        最小值缺陷: 最大值多个时
        for (int i : dp) {
            if(i == maxSecond)
                sum++;
        }

        return sum;
    }
}
