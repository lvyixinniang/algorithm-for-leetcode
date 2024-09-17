package leetcode.Array;

public class leetcode53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {

/*//        前缀和会TLE ,绝对没法
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
//        子串 , 我感觉 可以 前缀和
        int[] sums = new int[n];
        sums[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            sums[i] = sums[i - 1] + nums[i];
            max = Math.max(max, nums[i]);
        }

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                int r = sums[i];
                int l = sums[j];
                int x = r - l ;
                if (r == l) {
                    max = Math.max(max, r);
                    continue;
                }
                max = Math.max(max, sums[i] - sums[j]);
            }
        }
        return max;*/


//        这个也是动态规划的 , 但 空间消耗的 比较大
/*        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
        }

        int max =nums[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(dp[i],max);
        }
        return max;*/

//        动态规划 思想, 而且, 还是
        int pre = 0, maxTotal = nums[0];
        for (int n : nums) {
            pre = Math.max(pre + n, n);
            maxTotal = Math.max(maxTotal, pre);
        }
        return  maxTotal;
    }
}
