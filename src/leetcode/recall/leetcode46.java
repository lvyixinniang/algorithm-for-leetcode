package leetcode.recall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcode46 {
//    TODO 不会
    public static List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        
        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        allPermutation(list, output, 0, n);
        return list;
    }

    private static void allPermutation(List<List<Integer>> list, List<Integer> output, int first, int n) {
        if (first == n) list.add(new ArrayList<>(output));

        for (int i = first; i < n; i++) {
            Collections.swap(output, first, i);
            allPermutation(list, output, first + 1, n);
            Collections.swap(output, first, i);
        }
    }


    public static void main(String[] args) {
        List<List<Integer>> permute = permute(new int[]{1, 2, 3});
    }
}
