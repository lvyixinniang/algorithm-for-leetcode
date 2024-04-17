package leetcode;

import java.util.HashMap;
import java.util.Map;

public class leetcode01_Array {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,4};
        int target = 6;
        int[] ints = twoSum(nums, target);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashtable = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.println("111111111111XXXX" + hashtable.get(3));
//            错误在于target是nums数组上的某个值的两倍
            if(hashtable.containsKey(target - nums[i])){
//                为什么交换顺序后 成功,原因在于先判断时,未把值注入 , 避免查到自己的情况
                return new int[]{i,hashtable.get(target - nums[i])};
            }
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }
}
