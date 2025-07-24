package interface150II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lc54 {

    public List<Integer> spiralOrder(int[][] matrix) {
//        todo 模拟不太想做了 2025/7/21
        List<Integer> res = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int up = 0, down = m - 1, left = 0, right = n - 1;

        while (left <= right && up <= down) {
            // 向右
            for (int i = left; i <= right; i++) {
                res.add(matrix[up][i]);
            }
            up++;

            // 向下
            for (int i = up; i <= down; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            // 向左（检查是否还有未遍历的行）
            if (up <= down) { // 关键修复点
                for (int i = right; i >= left; i--) {
                    res.add(matrix[down][i]);
                }
                down--;
            }

            // 向上（检查是否还有未遍历的列）
            if (left <= right) { // 关键修复点
                for (int i = down; i >= up; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc54 lc54 = new lc54();
        lc54.spiralOrder(new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}});
    }
}
