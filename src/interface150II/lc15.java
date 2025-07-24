package interface150II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc15 {

    public List<List<Integer>> threeSum(int[] nums) {
        // todo 原本的去重逻辑有点问题 2025/7/19(重做)
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            int left = i + 1, right = len - 1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    int tempLeft = nums[left];
                    int tempRight = nums[right];
                    left ++;
                    right --;
                    while (left < right && tempLeft == nums[left]) {
                        left++;
                    }
                    while (left < right && tempRight == nums[right]) {
                        right--;
                    }
                } else if (sum < 0) {
                    int temp = nums[left];
                    left++;
                    while (left < right && temp == nums[left]) {
                        left++;
                    }
                } else {
                    int temp = nums[right];
                    right--;
                    while (left < right && temp == nums[right]) {
                        right--;
                    }
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
