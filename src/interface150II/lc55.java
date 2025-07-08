package interface150II;

import java.util.Arrays;

public class lc55 {

    public boolean canJump(int[] nums) {
        int len = nums.length;
        int maxJump = nums[0];
        for (int i = 1; i < len; i++) {
            if (maxJump >= i) {
                maxJump = Math.max(maxJump, i + nums[i]);
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lc55 lc55 = new lc55();
        System.out.println(lc55.canJump(new int[]{2,0,0}));
    }
}
