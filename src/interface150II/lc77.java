package interface150II;

import java.util.ArrayList;
import java.util.List;

public class lc77 {

    // todo 有重复的情况 12/1 重做 2/24重做
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backTracing(res, list, 0, n, k);
        return res;
    }

    private void backTracing(List<List<Integer>> res, List<Integer> list, int start, int n, int k) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
        }else {
            for (int i = start; i <= n; i++) {
                list.add(i);
                backTracing(res, list, start + 1, n, k);
                list.remove(list.size() - 1);
            }
        }
    }

}
