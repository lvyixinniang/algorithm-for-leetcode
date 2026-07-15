package interface150III;

/**
 * @author hc
 * @date
 **/
public class lc153 {
//  todo 难道也是单调性二分， 但是，单调增时，最小值，可能在左边，也可能在右边啊
    public int findMin(int[] nums) {
        int len = nums.length;
        // 难道也是单调性的二分
        int left = 0, right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
//                mid ~ right 递增
                right = mid;
            } else {
//                不单调，那一定右大，左小
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
