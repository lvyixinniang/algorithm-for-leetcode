package leetcode.LCR;

public class LCR168 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
    public static  int nthUglyNumber(int n) {
        int x = 0, y = 0, z = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            if (Math.min(dp[x] * 2, Math.min(dp[y] * 3, dp[z] * 5)) > dp[i - 1]){
                dp[i] = Math.min(dp[x] * 2, Math.min(dp[y] * 3, dp[z] * 5));
            }else {
                // 得到 是x, y , z的那一个
                if (dp[i - 1] == dp[x] * 2) {
                    x ++;
                } else if (dp[i - 1] == dp[y] * 3) {
                    y ++;
                } else if (dp[i - 1] == dp[z] * 5) {
                    z ++;
                }
                i --;
                continue;
            }

            if (dp[i] == dp[x] * 2) {
                x ++;
            } else if (dp[i] == dp[y] * 3) {
                y ++;
            } else if (dp[i] == dp[z] * 5) {
                z ++;
            }
        }
        return dp[n - 1];
    }
}
