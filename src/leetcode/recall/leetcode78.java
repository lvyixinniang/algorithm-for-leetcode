package leetcode.recall;

import java.util.ArrayList;
import java.util.List;

public class leetcode78 {
    public static  List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        process(nums, 0, list, new ArrayList<>());
        return list;
    }

    private static void process(int[] nums, int index, List<List<Integer>> res, ArrayList<Integer> line) {
        if (index == nums.length) {
            res.add(new ArrayList<>(line));
            return ;
        }
//        选择
        line.add(nums[index]);
        process(nums, index + 1, res, line);
//        不选择
        line.remove(line.size() - 1);
        process(nums, index + 1, res, line);
    }

    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }
}
