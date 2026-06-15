package interface150II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        bakcTracing(res, target, candidates, list,0, 0);
        return res;
    }

    private void bakcTracing(List<List<Integer>> res, int target
            , int[] candidates, List<Integer> list, int start,int sum) {
        if (sum == target) {
            res.add(new ArrayList<>(list));
        }else if (sum < target) {
            for (int i = start; i < candidates.length; i++) {
                if (sum + candidates[i] > target) {
                    break;
                }

                list.add(candidates[i]);
                bakcTracing(res, target, candidates, list, i, sum + candidates[i]);
                list.remove(list.size() - 1);
            }
        }
    }

}
