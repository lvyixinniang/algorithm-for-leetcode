package interface150;

import java.util.Arrays;

public class lc238 {

    public static  int[] productExceptSelf(int[] nums) {
        // 前缀和 + 后缀和
        int len = nums.length;
        int[] pre = new int[len];
        int[] last = new int[len];
        Arrays.fill(pre, 1);
        Arrays.fill(last, 1);
        for (int i = 1; i < len; i++) {
            if (i == 1) {
                pre[1] = nums[0];
                last[1] = nums[len - 1];
            }else {
                pre[i ] = pre[i - 1] * nums[i - 1];
                last[i ] = last[i - 1] * nums[len - i];
            }
        }
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = pre[i] * last[len - 1 - i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int[]{1, 2, 3, 4, 5}));
    }
}
