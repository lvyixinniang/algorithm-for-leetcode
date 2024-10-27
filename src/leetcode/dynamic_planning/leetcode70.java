package leetcode.dynamic_planning;

public class leetcode70 {
    public int climbStairs(int n) {
//        p 代表前一天（即第 i-2 天）爬楼梯的方法数。
//       q 代表当前天（即第 i-1 天）爬楼梯的方法数
//       r 代表下一天（即第 i 天）爬楼梯的方法数。
/*        int p = 0, q = 0, r = 1;
        for (int i = 1; i < n + 1; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;*/
//        dp数组中存储的是能到达当前台阶的 方法数
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i -2];
        }
        return dp[n];
    }
}
