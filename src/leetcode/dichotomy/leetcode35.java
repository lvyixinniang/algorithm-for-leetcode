package leetcode.dichotomy;

public class leetcode35 {
    public int searchInsert(int[] nums, int target) {
//        标准的二分法
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (r - l) /2 + l;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }
}
