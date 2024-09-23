package leetcode.Array;


import java.math.BigInteger;
import java.util.Arrays;

public class leetcode238 {
    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int[]{1, 2, 3, 4}));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] multiply = new int[n];
        Arrays.fill(multiply, nums[0]);
//       创建前缀和数组 以及 后缀和 数组
        int[] befores =new int[n];
        int[] laters = new int[n];
        Arrays.fill(befores, 1);
        Arrays.fill(laters, 1);

        for (int i = 1; i < n; i++) {
            befores[i] = befores[i - 1] * nums[i - 1];
            laters[n - 1 - i] = laters[n - i] * nums[n - i];
        }

        for (int i = 0; i < n; i++) {
            multiply[i] = befores[i] * laters[i];
        }

        return multiply;
    }
}
