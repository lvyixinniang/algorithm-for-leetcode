package leetcode.Multidimensional_dynamic_programming;

public class leetcode72 {
// todo 做不来
    public int minDistance(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();

        if (len1 * len2 == 0) return len1 + len2;

        int[][] dp = new int[len1][len2];



        return dp[len1][len2];
    }
}
