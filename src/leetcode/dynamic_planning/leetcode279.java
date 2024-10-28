package leetcode.dynamic_planning;

public class leetcode279 {
    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }

        public static int numSquares(int n) {
            int[] dp = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                int minn = Integer.MAX_VALUE;
                for (int j = 1; j * j <= i; j++) {
 //                    这里是求， 当前最大的平方数 需要加多少值 == i
                    minn = Math.min(minn, dp[i - j * j]);
                }
//                这里 需要加上一个平方数 所需要的值
                dp[i] = minn + 1;
            }
            return dp[n];
        }
}
