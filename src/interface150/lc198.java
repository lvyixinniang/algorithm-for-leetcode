package interface150;

public class lc198 {

    public static  int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
           dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        return dp[nums.length];
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2, 3, 1}));
        System.out.println(rob(new int[]{2,7,9,3,1}));
    }
}
