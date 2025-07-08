package interface150II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc15 {

    public List<List<Integer>> threeSum(int[] nums) {
        // todo 原本的去重逻辑有点问题
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // 外层去重
            if (i > 0 && nums[i] == nums[i - 1]) {continue;}

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 跳过重复的 left
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // 跳过重复的 right
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    // 移动指针继续搜索
                    left++;
                    right--;
                }else if (sum < 0) {
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
