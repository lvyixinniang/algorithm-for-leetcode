package Code_Capriccio.Recall;

import java.util.ArrayList;
import java.util.List;

public class lc216 {
    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> combinationSum3(int k, int target) {
        backTracking (k, target, 1, 0, new ArrayList<Integer>());
        return res;
    }

    private static void backTracking(int k, int target, int startIndex, int sum, ArrayList<Integer> path) {
        if (path.size() == k && sum == target) {
            res.add(path);
            return;
        }
        for (int i = startIndex; i <= 9; i++) {
            if (i >= target) continue; // 减脂
            path.add(i);
            sum += i;
            backTracking(k, target, i + 1, sum, new ArrayList<>(path));
            path.remove(path.size() - 1);
            sum -= i;
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 9));
    }
}
