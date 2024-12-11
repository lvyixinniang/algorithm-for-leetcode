package Written_Examination.zijie25_13;

import java.util.Scanner;

public class zijie_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n, a, b, c;
        String[] split = str.split("\\ ");
        n = Integer.parseInt(split[0]);
        a = Integer.parseInt(split[1]);// 移动相邻
        b = Integer.parseInt(split[2]);// 关闭其他
        c = Integer.parseInt(split[3]);// 关闭当前
        int[] arr = new int[n];

        str = sc.nextLine();
        String[] splitArr = str.split("\\ ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(splitArr[i]);
        }
        int min = 0;
        // dp
        a = a > c ? c : a;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                min += a;
            }if (arr[i] == 1) {
                min += b;
                break;
            }
        }
        System.out.println(min);
    }
}
