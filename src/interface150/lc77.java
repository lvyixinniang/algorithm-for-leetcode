package interface150;

import java.util.ArrayList;
import java.util.List;

public class lc77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if (n == 1 && k == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            lists.add(list);
            return lists;
        }
        List<Integer> list = new ArrayList<>();
        backStracking(lists, n, k, 1, list);
        return lists;
    }

    private void backStracking(List<List<Integer>> lists, int n, int k, int index, List<Integer> list) {
        if (list.size() == k) {
            lists.add(new ArrayList<>(list));
            return;
        } else {
            for (int i = index ; i <= n; i++) {
                list.add(i);
                backStracking(lists, n, k, i + 1, list);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        lc77 lc77 = new lc77();
        List<List<Integer>> lists = lc77.combine(4, 2);

    }
}
