package leetcode.dichotomy;

public class leetcode35 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        System.out.println(searchInsert(nums, 2));
    }
    public static int searchInsert(int[] nums, int target) {
        int  len = nums.length;
        int left = 0,right = len -1;
        int mid;
        while (left< right){
            mid = left + (right - left) / 2;
            if (nums[mid] > target){
                right = mid -1;
            }else if(nums[mid] < target){
                left = mid +1 ;
            }
        }

        return left;
    }
}
