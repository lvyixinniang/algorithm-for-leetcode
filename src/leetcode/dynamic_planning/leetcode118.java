package leetcode.dynamic_planning;

import java.util.ArrayList;
import java.util.List;

public class leetcode118 {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int n) {
        int[][] matrix = new int[n][n + 1];
        List<List<Integer>> res = new ArrayList<>();
        matrix[0][1] = 1;
        List<Integer> head = new ArrayList<>();
        head.add(1);
        res.add(head);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                matrix[i][j] = matrix[i-1][j] + matrix[i-1][j-1];
            }
            int[] row = matrix[i];
            ArrayList<Integer> list = new ArrayList<>();
            for (int j : row) {
                if (j != 0) list.add(j);
            }
            res.add(list);
        }
        return res;
    }
}
