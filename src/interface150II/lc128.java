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
        for (Integer s : set) {
            if (set.contains(s - 1)) {
                continue;
            }
            int sum = 1;
            int temp = s;
            while (set.contains(temp + 1)) {
                sum ++;
                temp ++;
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        lc128 lc128 = new lc128();
        System.out.println(lc128.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
