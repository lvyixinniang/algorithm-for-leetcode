package Code_Capriccio.Array;

import java.util.Scanner;

public class kc58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 前缀和
        int[] sum = new int[n];
        int count = 0;
        while (count < n) {
            int val = sc.nextInt();
            if (count == 0) sum[count] = val;
            else sum[count] = val + sum[count - 1];
            count ++;
        }
        int a, b;

        while (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0) System.out.println(sum[b]);
            else System.out.println(sum[b] - sum[a - 1]);
        }
        sc.close();
    }
}
