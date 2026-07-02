package huaweiOD;

import java.util.Scanner;

/**
 * @author hc
 * @date
 **/
public class P00003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        for (int num = 1; num <= n/2; num++) {
            //最少应该是两次循环
            //先做一些简单的剪枝
            boolean flag = true;
            for (int i = 0; i < num; i++) {
                if (arr[i] != arr[n-1-i]) {
                    flag = false;
                    break;
                }
            }
            if (!flag) continue;
            flag = true;
            //最终判断
            for (int i = 0; i < n - num; i += num) {
                for (int j = 0; j < num; j++) {
                    if (arr[i + j] != arr[i+j+num]) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) break;
            }
            if (flag) {
                for (int i = 0; i < num; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
