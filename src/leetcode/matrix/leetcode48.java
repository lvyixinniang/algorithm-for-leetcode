package leetcode.matrix;

public class leetcode48 {
    public static void main(String[] args) {
        rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp;
//        主对角线 翻转
        for (int y = 1; y < n; y++) {
            for (int x = 0; x < y; x++) {
                int i = matrix[y][x], j = matrix[x][y];
                temp = matrix[y][x];
                matrix[y][x] = matrix[x][y];
                matrix[x][y] = temp;
            }
        }

//        中轴对称 翻转
        int mid = n / 2;
        for (int i = 0; i < mid; i++) {
            for (int y = 0; y < n; y++) {
                int l = matrix[y][i], r = matrix[y][(n-1)-i];
                temp = matrix[y][i];
                matrix[y][i] = matrix[y][(n-1)-i];
                matrix[y][(n-1)-i] = temp;
            }
        }

    }
}
