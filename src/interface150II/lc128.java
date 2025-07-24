package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc128 {
    public int longestConsecutive(int[] nums) {
//        todo 需要优化起点 2025/7/19二做
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }
        int max = 0;
        for (Integer num : map.keySet()) {
            if (map.containsKey(num - 1)) continue;
            int tmp = num;
            while (map.containsKey(tmp + 1)) {
                map.put(tmp + 1, map.get(tmp) + 1);
                tmp++;
            }
            max = Math.max(max, map.get(tmp));
        }
        return max;
    }

    public static void main(String[] args) {
        lc128 lc128 = new lc128();
        System.out.println(lc128.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
