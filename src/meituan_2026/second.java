package meituan_2026;

import java.util.*;

/**
 * @author hc
 * @date
 **/
public class second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[q];
        int maxx = 0;
        for (int i = 0; i < q; i++) {
            arr[i] = sc.nextInt();
            maxx = Math.max(maxx, arr[i]);
        }

        long[] ans = new long[maxx];
        for (int i = 0; i < maxx; i++) {
            if (i < k) {
                ans[i] = 1;
                continue;
            }
            // > k 的 需要减去 S(n - k - 1)
            if (i - k - 1 >= 0) {
                ans[i] = Math.abs(2 * ans[i - 1] - ans[i - k - 1]);
            } else {
                ans[i] = 2 * ans[i - 1];
            }

            ans[i] %= Integer.MAX_VALUE;
        }

        // 输出结果
        for (int i = 0; i < q; i++) {
            System.out.println(ans[arr[i] -1]);
        }
    }
}
