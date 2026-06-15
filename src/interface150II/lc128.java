package interface150II;

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
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curmax = 1;
                while (set.contains(num + 1)) {
                    curmax++;
                    num++;
                }
                max = Math.max(max, curmax);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        lc128 lc128 = new lc128();
        System.out.println(lc128.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
