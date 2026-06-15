package interface150II;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        Arrays.fill(dp, false);
        dp[0] = true;
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < wordDict.size(); j++) {
                int lenj = wordDict.get(j).length();
                if (i >= lenj && dp[i - lenj] && wordDict.get(j).equals(s.substring(i - lenj, i))) {
                    dp[i] = true;
                }
            }
        }
        return dp[len];
    }

    public static void main(String[] args) {
        String s = "dogs";
        List<String> wordDict = Arrays.asList("dog", "s","gs");
        lc139 lc139 = new lc139();
        lc139.wordBreak(s, wordDict);
    }
}
