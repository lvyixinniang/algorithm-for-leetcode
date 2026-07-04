package interface150III;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hc
 * @date
 **/
public class lc77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backTracking(n, k, 1, res, new ArrayList<Integer>());
        return res;
    }
    private void backTracking(int n, int k
            , int index, List<List<Integer>> res
    , List<Integer> temp) {
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index ; i <= n; i++) {
            temp.add(i);
            backTracking(n, k, i + 1, res, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
