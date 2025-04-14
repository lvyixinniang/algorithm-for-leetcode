package interface150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class zijie4 {

    public int search (int[] nums, int target) {
        // write code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        return map.containsKey(target) ? map.get(target) : -1;
    }
}
