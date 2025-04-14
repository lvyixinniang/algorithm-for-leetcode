package interface150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lc128 {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int val : set) {
            if (!set.contains(val - 1)) {
                int currentNum = val;
                int curCount = 1;
                while (set.contains(currentNum + 1)) {
                    curCount++;
                    currentNum++;
                }
                max = Math.max(max, curCount);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        lc128 lc128 = new lc128();
        lc128.longestConsecutive(new int[]{100,4,200,1,3,2});
    }
}
