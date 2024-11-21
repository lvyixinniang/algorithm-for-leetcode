package leetcode.LCR.recall;

import java.util.*;

public class leetcode82 {
    static Set<List<Integer>> res = new HashSet<>();
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs (candidates, target, new ArrayList<Integer>(), 0);
        return new ArrayList<>(res);
    }

    private static void dfs(int[] candidates, int target, ArrayList<Integer> list, int index) {
        if (target == 0) {
            list.sort((o1,o2) -> o1 - o2);
            res.add(list);
            return ;
        }
        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > target) break;
            // 选择
            list.add(candidates[i]);
            dfs(candidates, target - candidates[i], new ArrayList<>(list), i + 1);
            // 不选
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{2,5,2,1,2}, 5));
    }
}
