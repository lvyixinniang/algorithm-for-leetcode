package 牛客;


import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class HJ35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] ans = new int[n][n];
        int len = n * (n + 1) / 2;

        int time = 1;
        int count = 0;
        for (int k = 1; k <= len; ) {
            if (count < time) {
                for (int j = 0; j < time; j ++) {
                    int i = time - 1- j;
                    ans[i][j] = k;
                    k++;
                    count ++;
                }
            } else {
                time++;
                count = 0;
            }
        }
        for (int[] arr : ans) {
            for (int val : arr) {
                if (val != 0)
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
