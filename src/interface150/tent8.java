package interface150;

public class tent8 {

    public int GetUglyNumber_Solution (int index) {
        if (index <= 0) return 0;
        int p2 = 0, p3 = 0, p5 = 0;
        int[] dp = new int[index];
        dp[0] = 1;
        for (int i = 1; i < index; i++) {
            dp[i] = Math.min(dp[p2] * 2, Math.min(dp[p3] * 3, dp[p5] * 5));
            if (dp[i] == dp[p2] * 2) p2++;
            if (dp[i] == dp[p3] * 3) p3++;
            if (dp[i] == dp[p5] * 5) p5++;
        }
        return dp[index - 1];
    }
}
