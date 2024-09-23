package leetcode.Array;

import java.util.Arrays;
import java.util.HashSet;

public class leetcode41 {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{3,4,-1,1}));
    }
    public static int firstMissingPositive(int[] nums) {
//        TLE了
        /*
        Arrays.sort(nums);
        int min = 1;
        int step = 0;
        int n = nums.length;
        while (step < n) {
            step = 0;
            for (int i = 0; i < n; i++) {
                step++;
                if (nums[i] <= 0) continue;
                if (nums[i] <min) continue;
                if (min == nums[i]) {
                    min ++;
                    break;
                }
            }
        }
        return min;*/

        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int  min = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) continue;
            set.add(nums[i]);
        }

        while (set.contains(min)) {
            min ++;
        }

        return min;
    }
}
