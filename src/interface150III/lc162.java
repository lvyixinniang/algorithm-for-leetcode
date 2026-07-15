package interface150III;

/**
 * @author hc
 * @date
 **/
public class lc162 {
//    todo 主要纠结二分和双指针
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (mid + 1 < len && nums[mid] < nums[mid + 1]) {
                // 递增趋势
                left = mid + 1;
            } else if (mid + 1 < len && nums[mid] > nums[mid + 1]) {
                // 递减趋势
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        lc162 p = new lc162();
        System.out.println(p.findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
}
