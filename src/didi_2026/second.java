package didi_2026;

import java.util.Scanner;

/**
 * @author hc
 * @date
 **/
public class second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int minh = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[i] = a + b;
                minh = Math.min(minh, arr[i]);
            }

            long sum = 0l;
            for (int i : arr) {
                sum += i - minh;
            }

            System.out.println(sum);
        }
    }
}
