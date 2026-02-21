package baidu_2025;

import java.util.Arrays;
import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t -- > 0) {
            int count = 0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            // 前缀和
            int[] arr = new int[n + 1];
            Arrays.fill(arr, 0);
            for (int i = 1; i <= n; i++) {
                int x = s.charAt(i - 1) - '0';
                arr[i] = x + arr[i - 1];
            }

            for (int i = 1; i <= n - k + 1; i++) {
                // i ~ i + k/2 和 i+ k/2 + 1 ~ i + k;
                if (arr[i + k/2 - 1] - arr[i - 1] == arr[i + k - 1] - arr[i + k/2 - 1]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
