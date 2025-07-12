package interface150II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for (int num : nums) {
            int diff = target - num;
            if (map.containsKey(diff)) {
                if (diff == num && map.get(num).size() > 1) {
                    return new int[]{map.get(num).get(0), map.get(num).get(1)};
                } else if (diff != num ) {
                    return new int[]{map.get(num).get(0), map.get(diff).get(0)};
                }
            }
        }
        return new int[2];
    }
}
