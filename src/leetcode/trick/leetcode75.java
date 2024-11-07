package leetcode.trick;

import java.util.Arrays;

public class leetcode75 {
    public static void main(String[] args) {
        sortColors(new int[]{2,0,2,1,1,0});
    }

    public static void sortColors(int[] nums) {
        int red = 0, wite = 0, blue = 0;
        for (int num : nums) {
            if (num == 0) red++;
            else if (num == 1) {
                wite++;
            }else
                blue++;
        }
        Arrays.fill(nums, 0, red, 0);
        Arrays.fill(nums, red, red + wite, 1);
        Arrays.fill(nums, red + wite, red + wite + blue, 2);
    }
}
