package interface150;

import java.util.ArrayList;
import java.util.List;

public class lc46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length == 0) return lists;

        backStracking(lists, nums, 0);
        return lists;
    }

    private void backStracking(List<List<Integer>> lists, int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            lists.add(new ArrayList<>(list));
            return;
        } else {
            for (int i = index; i < nums.length; i++) {
                reverse(nums, index , i);
                backStracking(lists, nums, index + 1);
                reverse(nums, index, i);
            }
        }
    }

    private void reverse(int[] nums, int l, int r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
    }

    public static void main(String[] args) {
        lc46 lc46 = new lc46();
        System.out.println(lc46.permute(new int[]{1, 2, 3}));
    }
}
