package leetcode.trick;

import java.util.*;

public class leetcode31 {
    public static void main(String[] args) {
        nextPermutation(new int[]{4,2,0,2,3,2,0});
    }
    public static void nextPermutation(int[] nums) {
//        TODO 待解决
//        将后面最大的 和 最大的前面小值的交换？
//        前面的值 权重会更大
        int len = nums.length;
        if (len == 1) return ;
//        找到递减序列
        int Max = 0, Min = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = len - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i]) {
                    map.put(nums[i], i);
                    map.put(nums[j], j);
                    Max = nums[i];
                    Min = nums[j];
                    break;
                }
            }
            if (!map.isEmpty()) break;
        }
        if (map.isEmpty()) {
            Arrays.sort(nums);
            return ;
        }
        int indexMax = map.get(Max);
        int indexMin = map.get(Min);
        nums[indexMax] = Min;
        nums[indexMin] = Max;
        Arrays.sort(nums, indexMin + 1, len);

    }
}
