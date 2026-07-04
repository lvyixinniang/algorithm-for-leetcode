package interface150III;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hc
 * @date
 **/
public class lc39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtraing(candidates, target, 0, res, new ArrayList<>());
        return res;
    }

    private void backtraing(int[] candidates, int target
            , int sum, List<List<Integer>> res, List<Integer> temp) {
        if (sum == target) {
            res.add(new ArrayList<>(temp));
            return;
        } else if (sum > target) {
            return;
        }
        for (int i = 0; i < candidates.length; i++) {
            sum += candidates[i];
            temp.add(candidates[i]);
            backtraing(candidates, target, sum, res, temp);
            temp.remove(temp.size() - 1);
            sum -= candidates[i];
        }
    }
}
