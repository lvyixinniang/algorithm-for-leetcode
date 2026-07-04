package interface150III;

/**
 * @author hc
 * @date
 **/
public class lc5 {
// todo
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        int maxx = 1;
        String res = s.substring(0);
        for (int i = 1; i < n; i++) {
            //dp[i][j] 表示从 i 到 j 是否是回文子串
            // 奇数
            dp[i][i] = true;
            if (i < n - 1
                    && i - 1 >= 0
                    && s.charAt(i - 1) == s.charAt(i + 1)) {
                dp[i-1][i+1] = true;
                int buchang = 1;
                while (i + buchang < n
                        && i - buchang >= 0
                        && s.charAt(i + buchang) == s.charAt(i - buchang)) {
                    dp[i-buchang][i+buchang] = true;
                    maxx = Math.max(maxx, 1 + 2*buchang);
                    buchang++;
                }
            }
            // 偶数
            if (i < n - 1
            && i - 1 - 1 >= 0
            && s.charAt(i) == s.charAt(i - 1)) {

                int buchang = 1;
                if ((buchang+1)*2 > maxx) {
                    maxx = (buchang+1)*2;
                    res = s.substring(i-1-buchang,i+buchang);
                }

                while (i + buchang < n
                && i - 1 - buchang >= 0
                && s.charAt(i + buchang) == s.charAt(i - 1 - buchang)) {
                    dp[i-1-buchang][i+buchang] = true;
                    if ((buchang+1)*2 > maxx) {
                        maxx = (buchang+1)*2;
                        res = s.substring(i-1-buchang,i+buchang);
                    }
                    buchang++;
                }
            }
        }
        return res;
    }
}
