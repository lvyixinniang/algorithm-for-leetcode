package interface150;

import java.util.Arrays;
import java.util.Stack;

public class tuan10 {
/*描述
给出一个长度为 n 的，仅包含字符 '(' 和 ')' 的字符串，计算最长的格式正确的括号子串的长度。

例1: 对于字符串 "(()" 来说，最长的格式正确的子串是 "()" ，长度为 2 .
例2：对于字符串 ")()())" , 来说, 最长的格式正确的子串是 "()()" ，长度为 4 .
*/
    public int longestValidParentheses (String s) {
        // write code here
/*        if (s == null || s.length() < 2) return 0;

        int n = s.length();
        int[] dp = new int[n]; // dp[i] 表示以 s.charAt(i) 结尾的最长有效括号子串的长度
        int maxLen = 0;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ')') {
                // 情况1：s[i-1] == '('，直接匹配
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                }
                // 情况2：s[i-1] == ')'，检查前面是否有匹配的 '('
                else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + 2 + (i - dp[i - 1] >= 2 ? dp[i - dp[i - 1] - 2] : 0);
                }
                // 更新最大值
                maxLen = Math.max(maxLen, dp[i]);
            }
        }

        return maxLen;*/

        if (s == null || s.length() < 2) return 0;
        int[] dp = new int[s.length()];
        Arrays.fill(dp, 0);
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                // 情况1 ： '(' 和 ’）‘相邻
                if (i > 0 && s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                }
                // 情况2 ： 不相邻
                else if (i >= 1 && i - dp[i - 1] - 1 >=0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + 2 + (i - dp[i - 1] - 2 >= 0 ? dp[i - dp[i - 1] - 2] : 0);
                }
                maxLen = Math.max(maxLen, dp[i]);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        tuan10 tuan10 = new tuan10();
        System.out.println(tuan10.longestValidParentheses("()(())"));
    }
}
