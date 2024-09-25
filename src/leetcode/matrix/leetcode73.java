package leetcode.matrix;

import java.util.ArrayList;
import java.util.List;

public class leetcode73 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        List<int[]> list = new ArrayList<int[]>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    list.add(new int[]{i,j});
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int y = list.get(i)[0], x = list.get(i)[1];
            for (int j = 0; j < n; j++) {
                matrix[y][j] = 0;
            }
            for (int j = 0; j < m; j++) {
                matrix[j][x] = 0;
            }
        }
    }
}
