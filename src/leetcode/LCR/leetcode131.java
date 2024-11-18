package leetcode.LCR;

public class leetcode131 {

    public int cuttingBamboo(int bamboo_len) {
        int[] dp = new int[bamboo_len + 1];
        for (int i = 2; i <= bamboo_len; i++) {
            int curMax = 0;
            for (int j = 0; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }

        return dp[bamboo_len];
    }
}
