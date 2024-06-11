package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode73_matrix {
   /* public static void main(String[] args) {
        int[][] matrix = new int[][]{{1},{0}};
        setZeroes(matrix);
    }*/

    /**
     * 双指针有一些问题
     */

   /* public static void setZeroes(int[][] matrix) {
        int  m = matrix.length;
        int n=matrix[0].length;

        // 使用ArrayList来记录为0的地方 , 空间最多 , 1->m*n
        List<Integer> list = new ArrayList<>();
        // 使用双指针来缩短时间
        for (int i=0;i<m;i++ ){
            for (int l=0,r=n-1;r>=l;r--,l++){
                if(matrix[i][l]==0){
                    list.add(i*n+l);
                }
                if(matrix[i][r]==0){
                    list.add(i*m+r);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i)/n;
            int y = list.get(i)%n;
            for (int j =0;j<n;j++){
                matrix[x][j]=0;
            }
            for (int j=0;j<m;j++){
                matrix[j][y]=0;
            }
        }
    }*/

    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i =0 ; i<m;i++){
            for (int j =0 ;j<n;j++){
                if(matrix[i][j]==0){
                    row[i] = col[j] = true;
                }
            }
        }
        for (int i=0;i<m;i++){
            for (int j =0 ;j<n;j++){
                if(row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
