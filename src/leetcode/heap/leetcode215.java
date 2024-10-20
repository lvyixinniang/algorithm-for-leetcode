package leetcode.heap;

import java.util.Arrays;

public class leetcode215 {
// TODO 不会快排
    public static  int findKthLargest(int[] nums, int k) {
//        快排 + 优化后
        int n = nums.length;
        return quickselect(nums, 0, n - 1, n - k);

//        堆排
    }

    private static  int quickselect(int[] nums, int l, int r, int k) {
/*        if (l == r) return nums[k];
        int partition = nums[l], i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (nums[i] < partition);
            do j--; while (nums[j] > partition);
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
//        代表左子树
        if (k <= j) return quickselect(nums, l, j, k);
//        代表 右子树
        else return quickselect(nums, j + 1, r, k);*/

        if (l == r) return nums[k];
        int x = nums[l] , i = l - 1, j = r + 1;
        while (i < j) {
            do i ++; while (nums[i] < x);
            do j --; while (nums[j] > x);
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
//        正在寻找的索引 k 在分区点 j 的左侧
        if (k <= j) return quickselect(nums, l, j, k);
        else  return quickselect(nums, j + 1, r, k);
    }

    public static void main(String[] args) {
        findKthLargest(new int[]{3,2,1,5,6,4}, 2);
    }
}
