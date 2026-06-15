package interface150II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class lc15 {
    // todo 原本的去重逻辑有点问题 2025/7/19(重做) 10/10重做 3/7
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len < 3) return res;
        Arrays.sort(nums);

        for (int i = 0; i < len - 2; i++) {
            int l = i + 1, r = len - 1;
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            if (nums[i] > 0) continue;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    l ++;
                    r --;

                } else if (sum > 0) {
                    r --;
                } else {
                    l ++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc15 lc15 = new lc15();
        System.out.println(lc15.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
