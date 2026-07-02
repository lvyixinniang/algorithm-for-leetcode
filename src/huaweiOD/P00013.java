package huaweiOD;

import java.util.Scanner;

/**
 * @author hc
 * @date
 **/
public class P00013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // 感染法
        int res = 0;
        arr[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    insect(arr, i, j);
                }
            }
        }

        System.out.println(res);
    }
    static void insect(int[][] arr, int i, int j) {
        int m = arr.length;
        int n = arr[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || arr[i][j] == 2) return;
        arr[i][j] = 1;
        // 上左下右（好像必须循环，才能对
        insect(arr, i - 1, j);
        insect(arr, i, j-1);
        insect(arr, i+1, j);
        insect(arr, i, j+1);
    }
}
