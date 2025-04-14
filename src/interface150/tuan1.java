package interface150;

public class tuan1 {
    public int search (int[] nums, int target) {
        // write code here
        // 二分查找
        int t = 0;
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i - 1] > nums[i]) {
                t = i;
            }
        }
        // 二分查找
        int l = 0, r = len - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }else {
                if (nums[mid] > nums[l]) {
                    // 说明 l ~ mid有序
                    if (nums[mid] > target) {
                        r = mid - 1;
                    } else{
                        l = mid + 1;
                    }
                } else {
                    // mid ~ r 有序
                    if (nums[r] > target) {
                        r = mid + 1;
                    }else {
                        l = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
