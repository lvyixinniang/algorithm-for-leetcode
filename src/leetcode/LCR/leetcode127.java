package leetcode.LCR;

public class leetcode127 {
    public static void main(String[] args) {
        System.out.println(trainWays(5));
    }
    public static int trainWays(int num) {
        // dp 问题
        if (num == 0 || num == 1) return 1;
        int[] dp = new int[num + 1];
        dp[0] = 1;
        dp[1] = 1;
        int count = 2;
        while (count <= num) {
            dp[count] = (dp[count - 1] % 1000000007 + dp[count - 2] % 1000000007) % 1000000007;
            count ++;
        }

        return dp[count - 1];
    }
}
