package interface150II;

import java.util.Arrays;

public class lc34 {
// 边界存在问题
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};


        // 两次遍历
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        int temp = l;

        if (nums[l] != target) {
            return new int[]{-1,-1};
        }

        r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l + 1) / 2; // 向上取整
            if (nums[mid] <= target) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }


        return nums[temp] == target ? new int[]{temp, r} : new int[]{-1,-1};
    }

    public static void main(String[] args) {
        lc34 lc34 = new lc34();
        System.out.println(lc34.searchRange(new int[]{5,7,7,8,8,10}, 8));
    }
}
