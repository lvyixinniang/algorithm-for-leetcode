package leetcode.dichotomy;

import java.util.Arrays;

public class leetcode34 {
// TODO 还可以采用两边二分法 来解决
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        Arrays.fill(res, -1);
//        双指针
        int length = nums.length;
        if (length == 0) return res;

        int l = 0, r = length - 1;
        while (l <= r) {
            if (nums[l] == target && nums[r] == target){
                res[0] = l;
                res[1] = r;
                return res;
            }
            if (nums[l] != target) {
                l ++;
            }
            if (nums[r] != target) {
                r --;
            }
        }
        return res;
    }
}
