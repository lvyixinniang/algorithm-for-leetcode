package leetcode.LCR;

import java.util.ArrayList;
import java.util.List;

public class LCR083 {

    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        BackTracking(0, list);
        return res;
    }

    private static void BackTracking( int index, List<Integer> list) {
        if (index == list.size())
            res.add(new ArrayList<>(list)); // 当排列完成时添加到结果集
        for (int i = index; i < list.size(); i++) {
//            System.out.println("index == " + index + "  i == " + i + "  list == " + list.toString());
            swap(list, index, i); // 交换，产生新的排列
            BackTracking(index + 1, list); // 递归调用，继续生成下一个位置的排列
            swap(list, index, i); // 回溯，恢复原来的列表状态
        }
    }

    private static void swap(List<Integer> list, int x, int y) {
        int l = list.get(x);
        list.set(x, list.get(y));
        list.set(y, l);
    }

}
