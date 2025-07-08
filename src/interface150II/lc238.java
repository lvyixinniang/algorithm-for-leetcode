package interface150II;

import java.util.Arrays;

public class lc238 {

    public int[] productExceptSelf(int[] nums) {
        // 前缀合 X 后缀和 （保险）

        // 全部 积
        int maxJ = 1;
        boolean flag = false; // 判断是否存在 0
        int index_0 = 0;//数量
        int[] res = new int[nums.length];
        Arrays.fill(res, 0);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                flag = true;
                index_0++;
                if (index_0 == 2) {
                    return res;
                }
            } else {
                  maxJ *= nums[i];
            }
        }

        if(flag) {// 存在0
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    res[i] = maxJ;
                }
            }
        }else {
            for (int i = 0; i < nums.length; i++) {
                res[i] = maxJ/nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc238 lc238 = new lc238();
//        System.out.println(lc238.productExceptSelf(new int[]{1,2,3,4}));
        System.out.println(lc238.productExceptSelf(new int[]{-1,1,0,-3,3}));
    }
}
