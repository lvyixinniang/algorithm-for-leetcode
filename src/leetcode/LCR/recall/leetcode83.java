package leetcode.LCR.recall;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode83 {
   static List<List<Integer>> res = new ArrayList<>();
   static List<Integer> list = new ArrayList<>();
    public static  List<List<Integer>> permute(int[] nums) {
        for (int num : nums) {
            list.add(num);
        }
        dfs (0);
        return new ArrayList<>(res);
    }

    private static void dfs(int x) {
        if (x == list.size() ) res.add(list);
        for (int i = 0; i < list.size() && x < list.size(); i++) {
            swap (i, x);
            dfs(x + 1);
            swap (i, x);
        }
    }
    private static void swap (int i, int x) {
        int tmp = list.get(i);
        list.set(i, list.get(x));
        list.set(x, tmp);
    }

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }
}
