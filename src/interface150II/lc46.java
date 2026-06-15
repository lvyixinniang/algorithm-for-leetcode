package interface150II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTracing(res, nums, 0);
        return res;
    }

    private void backTracing(List<List<Integer>> res, int[] nums, int index) {
        if (index == nums.length) {
            // 将当前数组转换为列表
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            res.add(list);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            backTracing(res, nums, index + 1);
            swap(nums, index, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        lc46 lc46 = new lc46();
        System.out.println(lc46.permute(new int[]{1, 2, 3}));
    }
}
