package interface150;

public class zijie1 {

    public int[][] rotateMatrix (int[][] mat, int n) {
        // write code here
        // 主对角线翻转 + 中心翻转
        if (n <= 1) return mat;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i ; j ++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j ++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - 1 - j];
                mat[i][n - 1 - j] = temp;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        zijie1 zijie1 = new zijie1();
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        zijie1.rotateMatrix (mat, 3);
    }
}
