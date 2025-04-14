package interface150;

import java.util.Arrays;
import java.util.Scanner;

public class tent2 {

    public int[][] foundMonotoneStack (int[] nums) {
        int len = nums.length;
        int[][] res = new int[len][2];
        for (int[] re : res) {
            Arrays.fill(re, -1);
        }
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                res[0][0] = -1;
            }
            if (i == len - 1) {
                res[i][1] = -1;
            }
            // 向右查找的情况
            for (int j = i + 1; j < len; j++) {
                if (nums[j] < nums[i]) {
                    res[i][1] = j;
                    break;
                }
            }

            // 向左
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i]) {
                    res[i][0] = j;
                    break;
                }
            }

        }
        return res;
    }
    public static void main(String[] args) {
        tent2 t = new tent2();
        System.out.println(t.foundMonotoneStack(new int[]{3,4,1,5,6,2,7}));
    }
}
