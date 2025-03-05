package interface150;

import java.util.ArrayList;
import java.util.List;

public class lc39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) return res;
        List<Integer> list = new ArrayList<>();
        backStracking (candidates, target, 0, 0, res, list);
        return res;
    }

    private void backStracking(int[] candidates, int target, int index, int sum, List<List<Integer>> res, List<Integer> list) {
        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        } else if (sum > target) {
            return;
        } else {
            for (int i = index ; i < candidates.length; i++) {
                sum += candidates[i];
                list.add(candidates[i]);
                backStracking(candidates, target, i, sum, res, list);
                sum -= candidates[i];
                list.remove(list.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        lc39 obj = new lc39();
        System.out.println(obj.combinationSum(new int[]{2,3,6,7}, 7));
    }

}
