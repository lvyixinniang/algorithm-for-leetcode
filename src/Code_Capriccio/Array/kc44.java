package Code_Capriccio.Array;

import java.util.Scanner;

public class kc44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[n][m];
        int sum = 0;
        int count = 0;
        while (count < n) {
            int mcount = 0;
            while (mcount < m) {
                arr[count][mcount] = sc.nextInt();
                sum += arr[count][mcount];
                mcount ++;
            }
            count ++;
        }
        int min = Integer.MAX_VALUE;
        int rsum = 0;
        // 遍历列 的 划分法
        for (int i = 0; i < m; i++) {
            if (min == 0) break;
            for (int j = 0; j < n; j++) {
                rsum += arr[j][i];
                // 求最小的情况
                if (j == n - 1) min = Math.min(min, Math.abs((rsum << 1) - sum));
            }
        }
        int lsum = 0;
        // 遍历行 的 划分法
        for (int i = 0; i < n; i++) {
            if (min == 0) break;
            for (int j = 0; j < m; j++) {
                lsum += arr[i][j];
                if (j == m - 1) min = Math.min(min, Math.abs((lsum << 1) - sum));
            }
        }

        sc.close();
        System.out.println(min);
    }
}
