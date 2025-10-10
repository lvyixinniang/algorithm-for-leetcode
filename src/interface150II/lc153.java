package interface150II;

public class lc153 {

    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r) {
            // 求最小
            int mid = l + (r - l) / 2;
            if (nums[mid] >= nums[r]) {
                // mid ~ r 无序
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3,4,5,1,2 };
        lc153 lc153 = new lc153();
        System.out.println(lc153.findMin(nums));
    }
}
