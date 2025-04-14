import java.util.Arrays;
import java.util.Scanner;

public class tuan2025Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[][] arr = new int[len][2];
        int m = 0, n = 0;
        for (int i = 0; i < len; i++) {
            arr[i][0] = sc.nextInt();
            m = m < arr[i][0] ? arr[i][0] : m;
            arr[i][1] = sc.nextInt();
            n = n < arr[i][1] ? arr[i][1] : n;
        }

        int[][] map = new int[m][n];
        for (int i = 0; i < len; i++) {
            Arrays.fill(map[0], 0);
        }

        for (int i = 0; i < len; i++) {
            map[arr[i][0]][arr[i][1]] = 1;
        }

        // 暴力
        for (int i = 0; i < len; i++) {
            int sum = 0;
            if (arr[i][0] == 0 && arr[i][1] == 0) {
                // 只查找 右， 和 下
                int count = 0;
                for (int j = 0; j < m; j++) {
                    if (count == 2) {
                        sum += 1;
                        break;
                    }
                    if (map[j][0] == 1) {
                        count ++;
                    }
                }
                count = 0;
                for (int j = 0; j < m; j++) {
                    if (count == 2) {
                        sum += 1;
                        break;
                    }
                    if (map[0][j] == 1) {
                        count ++;
                    }
                }
            } else if (arr[i][0] != 0 && arr[i][1] == 0) {

            }
            System.out.println(sum);
        }
    }
}
