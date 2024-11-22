package Code_Capriccio.Recall;

import java.util.ArrayList;
import java.util.List;

public class lc77 {
    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> combine(int n, int k) {
        backtracking (n , k, 1,  new ArrayList<Integer>());
        return res;
    }

    private static void backtracking(int n, int k, int index , ArrayList<Integer> list) {
        if (list.size() == k) {
            res.add(list);
            return ;
        }
        for (int i = index; i + (k - list.size()) <= n + 1; i++) {
            list.add(i);
            backtracking(n, k , i + 1, new ArrayList<>(list));
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }
}
