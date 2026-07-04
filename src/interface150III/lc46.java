package interface150III;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hc
 * @date
 **/
public class lc46 {
// todo if (start == nums.length)之类的条件
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (n == 1) {
            res.add(Arrays.asList(nums[0]));
        }

        backTracing(nums, res);
        return res;
    }
    private void backTracing(int[] nums, List<List<Integer>> res) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        res.add(new ArrayList<>(list));
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                swap(nums, i, j);
                backTracing(nums, res);
                swap(nums, i, j);
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
