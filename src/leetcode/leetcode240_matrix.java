package leetcode;

public class leetcode240_matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            int index = search(row, target);
            if (index >= 0) {
                return true;
            }
        }
        return false;
    }

    public int search(int[] nums,int target ){
        int low =0,high =nums.length -1;
        while (low <= high){
            int mid = (high -low) /2+low;
            int num = nums[mid];
            if(num == target){
                return mid;
            } else if (num > target) {
                high = mid -1;
            } else if (num < target) {
                low = mid+1;
            }
        }
        return -1;
    }

}
