package leetcode;

import java.util.Arrays;

public class leetcode283_Array {
    public static void main(String[] args) {
        int[] nums= new int[]{1,0,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int a=0,b=a+1;
        for (; b < len; b++) {
            if(b<=a){
                b=a+1;
            }
            if(nums[a] ==0){
                nums[a] =nums[b];
                nums[b] =0;
            }
            if(nums[a]!=0){
                a++;
            }
        }

        return ;
    }
}
