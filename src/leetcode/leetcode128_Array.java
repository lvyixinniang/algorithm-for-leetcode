package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class leetcode128_Array {
    public static void main(String[] args) {
        int[] nums =new int[]{100,4,200,1,3,2};
        longestConsecutive(nums);
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> nums_set = new HashSet<Integer>();
        for (int num : nums) {
            nums_set.add(num);
        }

        int maxline = 0;

        for (Integer num : nums_set) {
            if(!nums_set.contains(num-1)){
                int sum = 1;
                int currentNum = num;

                while(nums_set.contains(currentNum++)){
                    sum++;
                }
                maxline = Math.max(maxline , sum);

            }
        }


        return maxline;
    }
}
