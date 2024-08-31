package leetcode.Hash;

import java.util.HashMap;
import java.util.Map;

public class leetcode1 {
    public static void main(String[] args) {
//        System.out.println(twoSum(new int[]{3, 2, 4}, 6));
    }
//    第一种方法 比较笨 , 可以 直接查找 前面出现的值
//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i],i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])){
//                return new int[]{i,map.get(target - nums[i])};
//            }
//        }
//        return new int[2];
//    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target - nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }
}
