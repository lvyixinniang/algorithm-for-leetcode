package interface150II;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int slen = s.length();
        int wlen = wordDict.size();
        boolean[] dp = new boolean[slen];
        Arrays.fill(dp, false);
        for (int i = 0; i < slen; i++) {
            for (int j = 0; j < wlen; j++) {
                int currlen = wordDict.get(j).length();
                if (i + 1>= currlen) {
                    if (wordDict.get(j).equals(s.substring(i - currlen + 1, i + 1))) { // [l,r)
                        boolean temp = i - currlen >= 0 ? dp[i - currlen] : true;
                        dp[i] = dp[i] || temp;
                    }
                }
            }
        }
        return dp[slen - 1];
    }

    public static void main(String[] args) {
        String s = "dogs";
        List<String> wordDict = Arrays.asList("dog", "s","gs");
        lc139 lc139 = new lc139();
        lc139.wordBreak(s, wordDict);
    }
}
