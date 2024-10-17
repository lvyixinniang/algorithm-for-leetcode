package leetcode.dichotomy;

import java.util.Arrays;

public class leetcode33 {

    public int search(int[] nums, int target) {
        int exist = -1;
//        肯定是要先找到 K 值
        int length = nums.length;
        int k = 0;
        for (int i = 1; i < length; i++) {
            if (nums[i] < nums[i - 1]) {
                k = i;
            }
        }
//        这里的排序的话， 时间复杂度 ， 就超过了O(logn)
        Arrays.sort(nums);
        int l = 0, r = length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (nums[mid] == target) {
                exist = (mid + k) % length;
                break;
            } else if (nums[mid] > target) {
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }

        return exist;
    }
}
