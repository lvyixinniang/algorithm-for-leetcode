package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode54_matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int m =matrix.length,n = matrix[0].length;
        int left = 0 ,right = n-1,top=0,button=m-1;
        while(left <= right&& top <= button){
//            从左往右
            for (int i=left; i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
//            从上到下
            for (int i=top;i<=button;i++){
                list.add(matrix[i][right]);
            }
            right--;
//            从右向左
            if (left<=right && top <=button){
                for (int i = right;i>=left;i--){
                    list.add(matrix[button][i]);
                }
                button--;
            }

//            从下往上
            if (left<=right && top <=button){
                for (int i =button;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}
