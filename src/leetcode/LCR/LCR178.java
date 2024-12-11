package leetcode.LCR;

import java.util.HashMap;

public class LCR178 {
    public static void main(String[] args) {
        System.out.println(trainingPlan(new int[]{5, 7, 5, 5}));
    }
    public static int trainingPlan(int[] actions) {
        // hash ?
        HashMap<Integer, Integer> map = new HashMap<>(); //
        for (int i : actions) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) == 1) return i;
        }
        return -1;
    }
}
