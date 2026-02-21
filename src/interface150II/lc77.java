package interface150II;

import java.util.ArrayList;
import java.util.List;

public class lc77 {

    // todo 有重复的情况 12/1 重做
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            backTracing(res, list, 1,0 , n, k);
        return res;
    }

    private void backTracing(List<List<Integer>> res, List<Integer> list, int i , int index, int n, int k) {
        if (index == k) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (i = i; i <= n; i++) {
            list.add(i);
            backTracing(res, list, i + 1,index + 1, n, k);
            list.remove(list.size()-1);
        }
    }
}
