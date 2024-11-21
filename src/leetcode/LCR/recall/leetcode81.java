package leetcode.LCR.recall;

import java.util.*;
import java.util.stream.Collectors;

public class leetcode81 {
    Set<List<Integer>> res = new HashSet<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs (candidates, target, new ArrayList<Integer>());
        // 去重
        return new ArrayList<>(res);
    }

    private void dfs(int[] candidates, int target, ArrayList<Integer> list) {
        if (target == 0 ) {
            list.sort((o1,o2) -> o1 - o2);
            res.add(list);
            return ;
        }
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] > target) break;
            // 选择
            list.add(candidates[i]);
            dfs(candidates, target - candidates[i], new ArrayList<>(list));
            // 不选
            list.remove(list.size() - 1);
        }
    }
}
