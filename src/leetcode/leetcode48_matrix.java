package leetcode;

public class leetcode48_matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

//        先上下翻转
        double mid = n/2.0;
        for (int i =0 ;i<mid ;i++){
            for (int j =0;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-i-1][j];
                matrix[n-i-1][j] = temp;
            }
        }
//        后根据主对角翻转
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


    }
}
