import java.util.Arrays;

public class leetcode673_dp {
    public static  int findNumberOfLIS(int[] nums) {
        int n =nums.length , maxlen = 0, ans =0;
        int[] cnt =new int[n];
        int[] dp =new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            cnt[i] = 1;
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j]){
                    if(dp[j] +1 >dp[i]){
                        dp[i] = dp[j] +1;
//                        重置计数
                        cnt[i] = cnt[j];
                    }else if (dp[j] +1 == dp[i]){
                        cnt[i] += cnt[j];
                    }
                }
            }
            if(dp[i] > maxlen){
                maxlen = dp[i];
                ans = cnt[i];
            }else if (dp[i] == maxlen) {
                ans += cnt[i];
            }

        }

        return ans;
    }
}
