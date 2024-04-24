package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode15_Array {
//    TODO 没解出来
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        int left =0 , right =len -1;
        Arrays.sort(nums);
        List<List> lists = new ArrayList<>();
        for(int k = left +1; k<right ; k++){
            if(nums[left]+nums[right]+nums[k] == 0){
                List<Integer> list = new ArrayList<>();
                list.add(left);
                list.add(right);
                list.add(k);
            }
            if(nums[left]+nums[right]+nums[k] > 0){
                right--;
            }
        }

        return null;
    }
}
