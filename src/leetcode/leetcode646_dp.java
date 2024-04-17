package leetcode;

import java.util.Arrays;

public class leetcode646_dp {
    public static void main(String[] args) {
        int[][] pairs = new int[][]{{1,2}, {7,8}, {4,5}};
        System.out.println(findLongestChain(pairs));
    }
    public static int findLongestChain(int[][] pairs) {
        int len = pairs.length;
        Arrays.sort(pairs , (a,b)->a[0]-b[0]);
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if(pairs[i][0]>pairs[j][1]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }

        return dp[len-1];

    }
}
