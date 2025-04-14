package interface150;

public class Java15 {

    public int[][] solve (int[][] a, int[][] b) {
        // matrix 相乘
        // A 的 i 行 乘 B 的 j 列
        int n = a.length;
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }
        return c;
    }
}
