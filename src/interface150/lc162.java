package interface150;

public class lc162 {

    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int l = 0, r = len - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (len == 1) {
                return 0;
            } else if (mid == 0) {
                if (nums[0] > nums[1]) {
                    return 0;
                }
            } else if (mid == len - 1) {
                if (nums[mid] > nums[len- 2]){
                    return mid;
                }
            } else {
                if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
                    return mid;
                } else if (nums[mid] > nums[mid+1]) {
                    r = mid - 1;
                } else if (nums[mid] > nums[mid-1]) {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}
