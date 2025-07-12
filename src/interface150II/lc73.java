package interface150II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc73 {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length, n = matrix[0].length;
        List<int[]> indexs = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    indexs.add(new int[]{i, j});
                }
            }
        }
        for (int i = 0; i < indexs.size(); i++) {
            int[] index = indexs.get(i);
            Arrays.fill(matrix[index[0]], 0);
            for (int j = 0; j < row; j++) {
                matrix[j][index[1]] = 0;
            }
        }
    }
}
