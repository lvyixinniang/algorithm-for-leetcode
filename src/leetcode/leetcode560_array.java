package leetcode;

import java.util.HashMap;

public class leetcode560_array {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
    public static int subarraySum(int[] nums, int k) {
//        前缀和 + 哈希表优化
        int count = 0,pre=0;
//        key为 i位置 的前缀和 , value 为出现的次数
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);// 意为 前缀和为 0 时,有一次出现过
        for (int i = 0; i < nums.length; i++) {
            pre +=nums[i];
            if(mp.containsKey(pre-k)){
                count += mp.get(pre -k);
            }
            mp.put(pre,mp.getOrDefault(pre,0)+1);
        }

        return count;
    }
}
