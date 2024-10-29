package leetcode.dynamic_planning;

import java.util.List;

public class leetcode139 {
/*//      回溯方法 TLE
    public boolean wordBreak(String s, List<String> wordDict) {
        return judge(s, wordDict, 0);

    }

    private boolean judge(String s, List<String> wordDict, int start) {
        if (start == s.length()) return true;

        for (String word : wordDict) {
            int end = start + word.length();
            if (end <= s.length() && word.equals(s.substring(start, end))) {
                if (judge(s, wordDict, end)) return true;
            }
        }
        return false;
    }*/

//    动态规划 方法
//    字符串拼接 的 动态规划问题
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
//      状态转移方程  dp[i] = 遍历 ( dp[j] + wordDict.contains(s.substring(j, i)) )
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
