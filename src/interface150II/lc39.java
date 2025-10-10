package interface150II;

import java.util.ArrayList;
import java.util.List;

public class lc39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backTrace(candidates, target, res, 0, 0, list);
        return res;
    }

    private void backTrace(int[] candidates, int target, List<List<Integer>> res, int start, int sum, List<Integer> list) {
        if (sum == target) {
            res.add(new ArrayList<>(list));
        } else if (sum > target) {
            return;
        } else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                sum += candidates[i];
                backTrace(candidates, target, res, i, sum, list);
                list.remove(list.size() - 1);
                sum -= candidates[i];
            }
        }
    }
}
