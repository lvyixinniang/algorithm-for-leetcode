package huaweiOD;

import java.util.Scanner;

/**
 * @author hc
 * @date
 **/
public class P00012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        //如果m 不能大于等于 arr【0】，也就是，绝对不满足
        if (m <arr[0]) {
            return;
        }

        // 目前只能想到模拟，暴力了
        int atleast = (sum - m) / (n-1);
        for (int i = atleast; i <= sum; i++) {
            int temp = 0;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    temp = m - arr[0];
                } else {
                    if (temp < arr[j]) {
                        flag = false;
                        break;
                    }
                    temp -= arr[j];
                }
                temp += i;
            }
            if (flag) {
                System.out.println(i);
                break;
            }
        }
    }
}
