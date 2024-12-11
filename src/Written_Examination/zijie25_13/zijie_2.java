package Written_Examination.zijie25_13;

import java.util.Scanner;

public class zijie_2 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        int t = Integer.parseInt(str);
        int n,k;
        long[] arr = new long[10000000];
        arr[0] = 1;
        arr[1] = 1;
        long[] count = new long[10000000];
        count[0] = 1;
        count[1] = 2;
        for (int i = 2; i < 10000000; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % Integer.MAX_VALUE;
            count[i] = (count[i - 1] + arr[i]) % Integer.MAX_VALUE;// n 有sum【n - 1】个k
        }
        arr[1] = 2;
        for (int i = 2; i < 10000000; i++) {
            arr[i] = (arr[i - 1] + (arr[i] * arr[i])) % Integer.MAX_VALUE;
        }

        for (int p = 0; p < t; p++) {
            str = sc.nextLine();
            String[] split = str.split("\\ ");
            n = Integer.parseInt(split[0]);
            k = Integer.parseInt(split[1]);
            long sum = 0; // 记录总数
            if (n == 0){
                System.out.println(0);
                continue;
            }else if (n == 1) {
                sum = ((k * k) + k) % Integer.MAX_VALUE;
                System.out.println(sum);
                continue;
            }else if (n == 2) {
                sum = (2 * (k * k) + 2 * k) % Integer.MAX_VALUE;
                System.out.println(sum);
                continue;
            }
            int[] dp = new int[3];
            dp[0] = k;
            dp[1] = k;
            // 数学/ 前缀和？
//            sum = (arr[n - 1] * (k * k) % Integer.MAX_VALUE + (count[n - 1] * k)% Integer.MAX_VALUE) ;
            sum = arr[n - 1] * (k * k) % Integer.MAX_VALUE;
            sum += (count[n - 1] * k)% Integer.MAX_VALUE;
            System.out.println(sum);
        }
    }
}
