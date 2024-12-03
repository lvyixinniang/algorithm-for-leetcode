package Written_Examination;

import java.util.Scanner;

public class zijie_147 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();
        int n , k , a1 , a2 , a3;
        for (int q = 0; q < query; q++) {
            n = sc.nextInt();
            k = sc.nextInt();
            a1 = sc.nextInt();
            a1 --;
            a2 = sc.nextInt();
            a2 --;
            a3 = sc.nextInt();
            a3 --;
            if (n < k * 3) {
                System.out.println(-1);
                continue;
            }
            // 三个柱子 分别应该在 k - 1, 2*k -1, 3*k - 1
            int min = 0;
            for (int i = 0; i < k; i++) {
                // i 表示 第一个 红猪 出现的1 下标
                int sum = 0;
                // 现在有 位置 i ， i + k， i + 2*K
            }
        }
    }
}
