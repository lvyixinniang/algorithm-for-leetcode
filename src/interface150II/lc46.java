package interface150II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        backTrace(res, 0, list);
        return res;
    }

    private void backTrace( List<List<Integer>> res, int index, List<Integer> list ) {
        if (index == list.size()) {
            res.add(new ArrayList<>(list));
        }

        for (int i = index; i < list.size(); i++) {
            swap(list, index, i);
            backTrace(res, index + 1, list);
            swap(list, index , i);
        }

    }

    private void swap(List<Integer> list, int index, int i) {
        int temp = list.get(index);
        list.set(index, list.get(i));
        list.set(i, temp);
    }


    public static void main(String[] args) {
        lc46 lc46 = new lc46();
        System.out.println(lc46.permute(new int[]{1, 2, 3}));
    }
}
