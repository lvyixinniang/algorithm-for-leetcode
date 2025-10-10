package interface150II;

import java.util.ArrayList;
import java.util.List;

public class lc77 {

    // todo 有重复的情况
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backTrace(n, k, 1, res, new ArrayList<Integer>());
        return res;
    }

    private void backTrace(int n, int k, int start, List<List<Integer>> res, ArrayList<Integer> list) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        } else {
            for (int i = start; i <= n - (k - list.size()) + 1; i++) {
                list.add(i);
                backTrace(n, k , i + 1, res, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
