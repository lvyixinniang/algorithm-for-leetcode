package leetcode.trick;

import java.util.Arrays;

public class leetcode136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
    public static  int singleNumber(int[] nums) {
/*        int len = nums.length;
        if (len == 1) return nums[0];
        Arrays.sort(nums);
        int pre = 0, last = pre + 1;
        for (; last < nums.length; ) {
            if (nums[pre] != nums[last]) return nums[pre];
            pre += 2;
            last= pre + 1;
        }
        return nums[len - 1];*/

//        任何数和 0 做异或运算，结果仍然是原来的数，即 a⊕0=a。
//        任何数和其自身做异或运算，结果是 0，即 a⊕a=0。
//        异或运算满足交换律和结合律，即 a⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b。

        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
