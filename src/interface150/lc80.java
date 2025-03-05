package interface150;

import java.util.HashSet;
import java.util.Set;

public class lc80 {

    public static  int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;

        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            // 唯一
            if (nums[i] != nums[i+1]) {
                nums[res++] = nums[i];
            }
            // 不唯一
            else {
                nums[res++] = nums[i];
                nums[res++] = nums[i];
                int index = i + 1;
                while(i < nums.length && nums[index] == nums[i]) {
                    i++;
                }
                i -= 1;
            }
        }
        if (nums[res - 1] != nums[nums.length - 1]) {
            nums[res++] = nums[nums.length - 1];
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
        System.out.println(removeDuplicates(new int[]{1}));
    }
}
