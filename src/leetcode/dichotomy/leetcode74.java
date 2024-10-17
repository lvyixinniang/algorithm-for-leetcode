package leetcode.dichotomy;

public class leetcode74 {

    public static boolean  searchMatrix(int[][] matrix, int target) {
        int r = matrix.length, l = matrix[0].length;
        int[] arr = new int[r * l];
        for (int i = 0; i < r; i++) {
            for (int k = 0; k < l; k++) {
                arr[i*l + k] = matrix[i][k];
            }
        }
        int le = 0, ri =  r*l - 1;
        while (le <= ri) {
            int mid = (ri - le) / 2 + le;
            if (arr[mid] == target) return true;
            else if (arr[mid] > target) {
                ri = mid - 1;
            }else {
                le = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 30);
    }
}
