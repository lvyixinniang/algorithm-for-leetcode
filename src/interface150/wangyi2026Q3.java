package interface150;

import java.util.*;

public class wangyi2026Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt(), N = sc.nextInt();
        // 四层循环 ， 有解 即 退出？
        int[] res = new int[4];
/*        for (int x = 0; x < 2500; x++) {
            for (int y = 0; y < 2500; y++) {
                for (int z = 0; z < 2500; z++) {
                    for (int w = 0; w < 2500; w++) {
                        int temp = A * x + B * y+ C * z+ D *w;
                        if (temp == N) {
                            res[0] = x;
                            res[1] = y;
                            res[2] = z;
                            res[3] = w;
                            for (int i = 0; i < 4; i++) {
                                System.out.print(res[i] + " ");
                            }
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(-1);*/
        // 优化 使用三层循环 加 数学呢？
/*        for (int x = 0; x < 2500; x++) {
            for (int y = 0; y < 2500; y++) {
                for (int z = 0; z < 2500; z++) {
                    int temp = A * x + B * y + C * z ;
                    int w = (N - temp) / D;
                    if (w < 2500 && w >= 0) {
                        if (temp + D * w == N) {
                            res[0] = x;
                            res[1] = y;
                            res[2] = z;
                            res[3] = w;
                            for (int i = 0; i < 4; i++) {
                                System.out.print(res[i] + " ");
                            }
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(-1);*/
        // 优化 使用二层循环 + 双指针 + 数学
        for (int x = 0; x < 2500; x++) {
            for (int y = 0; y < 2500; y++) {
               int temp = A * x + B * y;
               int z = 0, w = 2500;
               while (z <= 2500 && z >= 0 && w >= 0 &&w <= 2500 && z <= w) {
                   if (temp + C * z + D * w == N) {
                       res[0] = x;
                       res[1] = y;
                       res[2] = z;
                       res[3] = w;
                       for (int i = 0; i < 4; i++) {
                           System.out.print(res[i] + " ");
                       }
                       return;
                   } else if (temp + C * z + D * w < N) {
                       z++;
                   } else {
                       w--;
                   }
               }
            }
        }
        System.out.println(-1);
    }
}
