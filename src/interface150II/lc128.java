package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc128 {
    public int longestConsecutive(int[] nums) {
//        todo 需要优化起点
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 1);
        }
        int max = nums.length == 0 ? 0 : 1;
        for (Integer num : map.keySet()) {
            int temp = num;
            if (!map.containsKey(temp - 1)) {
                while (map.containsKey(temp + 1)) {
                    map.put(temp + 1, map.get(temp) + 1);
                    max = Math.max(max, map.get(temp + 1));
                    temp ++;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        lc128 lc128 = new lc128();
        System.out.println(lc128.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
