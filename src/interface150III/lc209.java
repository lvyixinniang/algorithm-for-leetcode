package interface150III;

import java.util.Arrays;

/**
 * @author hc
 * @date
 **/
public class lc209 {

    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0;
        int n = nums.length;
        int sum = nums[l];
        int minn = n + 1;
        while (l <= r && r < n) {
            if (sum < target) {
                r++;
                if (r < n)
                sum += nums[r];
            } else if (sum >= target) {
                minn = Math.min(minn, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        return minn == n + 1 ? 0 : minn;
    }

    public static void main(String[] args) {
        lc209 lc209 = new lc209();
        System.out.println(lc209.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
}
