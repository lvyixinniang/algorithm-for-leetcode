package leetcode.dichotomy;

public class leetcode74 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 3));
    }

    public static boolean  searchMatrix(int[][] matrix, int target) {
        int m = matrix.length,n=matrix[0].length;
        int[] nums = new int[m*n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                nums[i*n+j] = matrix[i][j];
            }
        }

        int l = 0 , r = m*n -1;
        int mid;
        while (l<r) {
            mid = (r - l)>>2 +l;
            if (target == nums[mid]) return true;
            else if (target < nums[mid]){
                r = mid -1;
            }else {
                l = mid + 1;
            }
        }

        return false;
    }
}
