package leetcode.recall;

import java.util.ArrayList;
import java.util.List;



public class leetcode39 {
// ? 我的思路竟然对了
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        放进回溯 函数中， 如果 和 >= target return;
        List<List<Integer>> list = new ArrayList<>();
        process(list, new ArrayList<Integer>(), candidates, target, 0, 0);

        return list;
    }

    private void process(List<List<Integer>> list, ArrayList<Integer> line, int[] candidates, int target, int sum, int index) {
        if (index >= candidates.length) return;
        if (list.size() >= 150) return ;
        if (sum >target) {
            return;
        }else if (sum == target){
            list.add(new ArrayList<>(line));
            return;
        }

//        选择index
        line.add(candidates[index]);
        sum += candidates[index];
        process(list, line, candidates, target, sum, index);
//        不选择index
        line.remove(line.size() - 1);
        sum -= candidates[index];
        process(list, line, candidates, target, sum, index + 1);
    }
}
