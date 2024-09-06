package leetcode.DoublePointer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 此类用于 , 测试力扣42题的 解雨水 的所需数据类型 , 单调栈
 */
public class leetcode42_test {
    public static void main(String[] args) {
        int[] nums = new int[]{2,4,5,3,6,7,10,1};
        singleStack(nums);
    }

    public static void singleStack(int[] nums){
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                int currIndex = stack.pop();
                System.out.println(nums[currIndex]);
            }
            stack.push(i);
        }
    }
}
