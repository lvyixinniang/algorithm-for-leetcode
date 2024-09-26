package leetcode.matrix;

import java.util.ArrayList;
import java.util.List;

public class leetcode54 {
    public static void main(String[] args) {
        spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int l = n, d = m, r = n, u = m - 1;
        List<Integer> list = new ArrayList<>();
        int sum = 0;
//        list.add(matrix[0][0]);
        int i = 0, j = 0;
        while (sum < m * n) {
            for (int x = 0; x < l; x++) {
              list.add(matrix[i][j++]);
              sum ++;

            }
            if (sum >= m * n) {
                break;
            }
            j --;
            l -=2;
            i ++;
            for (int x = 0; x < d - 1; x++) {
                list.add(matrix[i++][j]);
                sum ++;
            }
            if (sum >= m * n) {
                break;
            }
            i --;
            d -=2;
            j --;
            for (int x = 0; x < r - 1; x++) {
                list.add(matrix[i][j--]);
                sum ++;
            }
            if (sum >= m * n) {
                break;
            }
            j ++;
            r -=2;
            i --;
            for (int x = 0; x < u - 1; x++) {
                list.add(matrix[i--][j]);
                sum ++;
            }
            if (sum >= m * n) {
                break;
            }
            i ++;
            u -=2;
            j ++;
        }
        return list;
    }
}
