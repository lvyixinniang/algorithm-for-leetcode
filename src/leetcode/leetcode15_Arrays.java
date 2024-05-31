package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode15_Arrays {
    public static void main(String[] args) {
        int[] nums = {1,-1,-1,0};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if(nums.length<3){
            return lists;
        }
        if(nums[0]>0){
            return lists;
        }

        // 枚举 a
        for (int first = 0; first < n; ++first) {
            //需要和上次的值不同
            if(first >0 && nums[first] == nums[first-1]){
                continue;
            }
            // c对应的指针初始指向数组的最右端
            int third = n-1;
            int target = -nums[first];
            // 枚举b
            for(int second = first +1 ;second<n;++second){
                if(second>first+1 && nums[second]==nums[second-1]){
                    continue;
                }
                //需要保证 b 的指针 在 c的指针的左侧
                while(second<third && nums[second]+nums[third] > target){
                    --third;
                }
                // 如果指针重合，随着 b 后续的增加
                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                if(second == third){
                    break;
                }

                if(nums[second]+nums[third] == target){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    lists.add(list);
                }
               /* if (nums[second]+nums[third]<target){
                    break;
                }*/

            }
        }


        return lists;
    }
}
