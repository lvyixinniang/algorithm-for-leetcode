package leetcode.dichotomy;

public class leetcode153 {
//    TODO 旋转二分法， 没尝试过

    public int findMin(int[] nums) {
//        先判断是否为 升序 数组
        boolean flag = true;
        if (nums[0] >= nums[nums.length - 1]) flag = false;
//        如果是 则二分查找
        if (flag) {
            return nums[0];
        }
//        不是， 则 双指针查找
        int min = nums[nums.length - 1];
        for (int i = 0; i <= nums.length / 2; i++) {
            min = Math.min(min, nums[i]);
            min = Math.min(min, nums[nums.length - 1 - i]);
        }
        return min;
    }
}
