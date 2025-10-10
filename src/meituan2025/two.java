package meituan2025;

import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(maxExperience(a));
    }

    public static long maxExperience(int[] a) {
        int n = a.length;
        // dp[j]: 当前击败数的个位为j时获得的最大经验
        long[] dp = new long[10];
        Arrays.fill(dp, Long.MIN_VALUE);
        dp[0] = 0;  // 初始状态：0个击败

        for (int i = 0; i < n; i++) {
            long[] ndp = new long[10];
            Arrays.fill(ndp, Long.MIN_VALUE);
            for (int j = 0; j < 10; j++) {
                if (dp[j] == Long.MIN_VALUE) continue;

                // 1. 放走当前怪物：获得经验 = 怪物编号 (i+1)
                if (dp[j] + i + 1 > ndp[j]) {
                    ndp[j] = dp[j] + i + 1;
                }

                // 2. 击败当前怪物
                int newState = (j + 1) % 10;              // 新个位数状态
                long expGain = (long) a[i] * (1 + newState); // 经验增加量
                if (dp[j] + expGain > ndp[newState]) {
                    ndp[newState] = dp[j] + expGain;
                }
            }
            dp = ndp;
        }

        // 寻找最大值
        long ans = 0;
        for (long val : dp) {
            if (val > ans) ans = val;
        }
        return ans;
    }
}