package interface150II;

public class lc74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        for (int[] arr : matrix) {
            if (target >= arr[0] && target <= arr[n - 1]) {
                // 折半查找
                int l = 0, r = n - 1;
                while (l < r) {
                    int mid = l + (r - l) / 2;
                    if (arr[mid] == target) {
                        return true;
                    } else if (arr[mid] < target) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
