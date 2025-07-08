package interface150II;

import java.util.Arrays;

public class lc45 {

    public int jump(int[] nums) {
        // 也就是一定能跳到
        int n = nums.length;
        int end = 0;
        int maxPositon = 0;
        int steps = 0;
        for (int i = 0; i < n - 1; i++) {
            maxPositon = Math.max(maxPositon, i + nums[i]);
            if (i == end) {
                end = maxPositon;
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        lc45 jump = new lc45();
        System.out.println(jump.jump(new int[]{2,3,0,1,4}));
    }
}
