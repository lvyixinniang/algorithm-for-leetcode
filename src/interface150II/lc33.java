package interface150II;

public class lc33 {

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] <= nums[r]) {
                // mid ~ r 有序
                if (target >= nums[mid] && target <= nums[r]) {
                    // 在mid ~ r 区间
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                // l ~ mid 有序
                if (nums[mid] >= target && target >= nums[l]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return nums[l] == target ? l : -1;
    }

    public static void main(String[] args) {
        lc33 lc33 = new lc33();
        System.out.println(lc33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
}
