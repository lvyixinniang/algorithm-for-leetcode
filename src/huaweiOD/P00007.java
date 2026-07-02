package huaweiOD;

import java.util.Scanner;

/**
 * @author hc
 * @date
 **/
public class P00007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        if (sum < t) {
            System.out.println(0);
        }

        int methods = backTracing(arr, t, k, 0, 0, 0);
    }

    private static int backTracing(int[] arr, int t, int k, int index, int count, int sum) {
        if (count == k) {
            return sum == t ? 1 : 0;
        }
        int ways = 0;
        for (int i= index; i < arr.length; i++) {
            sum += arr[i];
            backTracing(arr, t, k, i, count + 1, sum);
        }
        return ways;
    }
}
