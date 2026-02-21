package interface150II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc15 {
    // todo 原本的去重逻辑有点问题 2025/7/19(重做) 10/10重做
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int left = i + 1, right = len - 1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
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
