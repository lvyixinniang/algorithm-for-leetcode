package leetcode.dynamic_planning;

public class leetcode5_dp {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len<2){
            return s;
        }
//        最长回文子字符串长度
        int maxLen = 1;
//        开始下标
        int begin = 0;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();
//        开始递推
//        先枚举子串长度
        for (int L = 2; L <= len ; L++) {
//            枚举左边界
            for (int i = 0; i < len; i++) {
//                右边界 j - i + 1 = len
                int j = L + i -1;
                if(j>=len){
                    break;
                }

                if(charArray[i]!=charArray[j]){
                    dp[i][j]=false;
                }else{
                    if(j - i < 3){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
//                只要 dp[i][L] == true 成立，就表示子串 s[i..L] 是回文，此时记录回文长度和起始位置
                if(dp[i][j] && j-i+1>maxLen){
                    maxLen = j-i+1;
                    begin = i;
                }
            }
        }

        return s.substring(begin , begin+maxLen);
    }

}
