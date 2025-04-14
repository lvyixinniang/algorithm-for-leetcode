package interface150;

import java.util.Scanner;

public class wangyi2026Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            // 0-上 ， 1- 左， 2-下， 3-右
/*            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int C = Integer.parseInt(strs[0]);
            int[] operation = new int[strs.length - 1];
            for (int i = 1; i < strs.length; i++) {
                operation[i - 1] = Integer.parseInt(strs[i]);
            }*/
            int C = sc.nextInt();
            int[] operation = new int[C];
            for (int i = 0; i < C; i++) {
                operation[i] = sc.nextInt();
            }
            int M = sc.nextInt(), N = sc.nextInt();
            int[][] arr = new int[M][N];
            // 存储举证
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < operation.length; i++) {
                int oper = operation[i];
                // 0-上 ， 1- 左， 2-下， 3-右
                if (oper == 0) {
                    for (int x = 0; x < M;  x++) {
                        for (int y = 0; y < N; y++) {
                            if (arr[x][y] == 0) {
                                continue;
                            }
                            // 先看看可以否 向上移动
                            int temp = x;
                            boolean flag = false;
                            while (temp > 0 && arr[temp - 1][y] == 0) {
                                temp -- ;
                                flag = true;
                            }
                            if (flag) {
                                arr[temp][y] = arr[x][y];
                                arr[x][y] = 0;
                            }
                            // 判断是否可以合并
                            if (temp > 0 && arr[temp][y] == arr[temp - 1][y]) {
                                arr[temp - 1][y] *= 2;
                                arr[temp][y] = 0;
                            }
                            //  最后再继续堆积
                            flag = false;
                            while (temp > 0 && arr[temp - 1][y] == 0) {
                                temp -- ;
                                flag = true;
                            }
                            if (flag) {
                                arr[temp][y] = arr[x][y];
                                arr[x][y] = 0;
                            }
                        }
                    }
                }else if (oper == 2) {
                    for (int x = M - 1; x >= 0;  x--) {
                        for (int y = 0; y < N; y++) {
                            if (arr[x][y] == 0) {
                                continue;
                            }
                            // 先看看可以否 向下移动
                            int temp = x;
                            boolean flag = false;
                            while (temp < M - 1 && arr[temp + 1][y] == 0) {
                                flag = true;
                                temp ++;
                            }
                            if (flag) {
                                arr[temp][y] = arr[x][y];
                                arr[x][y] = 0;
                            }
                            // 判断是否可以合并
                            if (temp < M  && arr[temp][y] == arr[temp + 1][y]) {
                                arr[temp + 1][y] *= 2;
                                arr[temp][y] = 0;
                            }
                            // 堆积
                            flag = false;
                            while (temp < M - 1 && arr[temp + 1][y] == 0) {
                                flag = true;
                                temp ++;
                            }
                            if (flag) {
                                arr[temp][y] = arr[x][y];
                                arr[x][y] = 0;
                            }
                        }
                    }
                }else if (oper == 1) {
                    // 向左
                    for (int x = 0; x < M; x++) {
                        for (int y = 0; y < N; y++) {
                            if (arr[x][y] == 0) {
                                continue;
                            }
                            // 先看看可以否 向右移动
                            int temp = y;
                            boolean flag = false;
                            while (temp > 0 && arr[x][temp - 1] == 0) {
                                flag = true;
                                temp --;
                            }
                            if (flag) {
                                arr[x][temp] = arr[x][y];
                                arr[x][y] = 0;
                            }
                            // 判断是否可以合并
                            if (temp > 0 && arr[x][temp] == arr[x][temp - 1]) {
                                arr[x][temp - 1] *= 2;
                                arr[x][temp] = 0;
                            }
                            // 堆积
                            flag = false;
                            while (temp > 0 && arr[x][temp - 1] == 0) {
                                flag = true;
                                temp --;
                            }
                            if (flag) {
                                arr[x][temp] = arr[x][y];
                                arr[x][y] = 0;
                            }
                        }
                    }
                }else if (oper == 3) {
                    // 向右
                    for (int x = 0; x < M; x++) {
                        for (int y = N - 1; y >= 0; y--) {
                            if (arr[x][y] == 0) {
                                continue;
                            }
                            // 先看看可以否 向左移动
                            int temp = y;
                            boolean flag = false;
                            while (temp < N - 1 && arr[x][temp + 1] == 0) {
                                flag = true;
                                temp ++;
                            }
                            if (flag) {
                                arr[x][temp] = arr[x][y];
                                arr[x][y] = 0;
                            }
                            // 判断是否可以合并
                            if (temp < N - 1 && arr[x][temp] == arr[x][temp + 1]) {
                                arr[x][temp + 1] *= 2;
                                arr[x][temp] = 0;
                            }
                            // 堆积
                            flag = false;
                            while (temp < N - 1 && arr[x][temp + 1] == 0) {
                                flag = true;
                                temp ++;
                            }
                            if (flag) {
                                arr[x][temp] = arr[x][y];
                                arr[x][y] = 0;
                            }
                        }
                    }
                }
            }
            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    System.out.print(arr[x][y] + " ");
                }
                System.out.println();
            }
        }
    }
}
