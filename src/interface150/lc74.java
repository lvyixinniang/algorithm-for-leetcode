package interface150;

public class lc74 {

    public boolean searchMatrix(int[][] matrix, int target) {
//        boolean flag = false;
        for (int[] ints : matrix) {
            // 二分查找
            int l = 0 , r = ints.length - 1;
            if (l == r) {
                if (ints[0] == target) {
                    return true;
                }
            }
            while (l < r) {
                int mid = (r - l) / 2 + l;
                if (ints[mid] == target) {
                    return true;
                } else if (ints[mid] > target) {
                    r = mid - 1;
                } else if (ints[mid] < target) {
                    l = mid + 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        lc74 lc74 = new lc74();
//        System.out.println(lc74.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},3));
        System.out.println(lc74.searchMatrix(new int[][]{{1}},1));
    }
}
