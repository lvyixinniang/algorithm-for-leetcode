package leetcode.matrix;

import java.util.HashSet;
import java.util.Set;

public class leetcode240 {
    public static void main(String[] args) {
        searchMatrix(new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}},5);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        Boolean flag = false;
        for (int[] ints : matrix) {
//            逐行 进行 二分查找
            boolean search = search(ints, target);
            if (search) return true;
        }
        return false;
    }
    public static boolean search(int[] row, int target) {
        int l = 0, r = row.length - 1;
        int mid ;
        while (l <= r) {
            mid = (r -l) / 2 + l;
            if (row[mid] == target) return true;
            if (row[mid] > target) r = mid - 1;
            else  {
                l = mid + 1;
            }
        }
        return false;
    }
}
