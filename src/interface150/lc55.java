package interface150;

import java.util.Arrays;

public class lc55 {

    public static boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        int farthest = nums[0]; // 能到达最远位置
        for (int i = 1; i <= farthest; i++) {
            if (farthest >= nums.length - 1) {
                break;
            }
            farthest = Math.max(farthest, i + nums[i]);
        }
        return farthest >= nums.length - 1;
    }

    public static void main(String[] args) {
        canJump(new int[]{2, 3, 1, 1, 4});
        canJump(new int[]{0,2,3});
        canJump(new int[]{0});
        canJump(new int[]{1, 2,3});
    }
}
