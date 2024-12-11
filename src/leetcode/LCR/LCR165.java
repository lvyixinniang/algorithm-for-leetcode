package leetcode.LCR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LCR165 {
    public static void main(String[] args) {
        System.out.println(crackNumber(0)); // 6
    }
    public static  int crackNumber(int ciphertext) {
        if (ciphertext == 0) return 1;
        List<Integer> list = new ArrayList<>();
        // 字母 26个， 只可能 1 or 2 位
        while (ciphertext > 0) {
            list.add(ciphertext % 10);
            ciphertext /= 10;
        }
        int len = list.size();
        if (len <= 1) return len;
        // 交叉
        for (int i = 0; 2 * i < len; i++) {
            Integer integer = list.get(i);
            list.set(i, list.get(len - 1- i));
            list.set(len - 1 - i, integer);
        }
        // dp ?
        int[] dp = new int[len];
        dp[0] = 1;
        if (list.get(0) * 10 + list.get(1) < 26) {
            dp[1] = 2;
        }else {
            dp[1] = 1;
        }
        // 类比 跳台阶 是 1 / 2 个台阶
        for (int i = 2; i < len; i++) {
            int sum = list.get(i - 1) * 10 + list.get(i);
            if (sum < 26 && sum >= 10) {
                dp[i] = dp[i - 2] + dp[i - 1];
            }else { // 不具备成为 二位 的字母可能
                dp[i] = dp[i - 1];
            }
        }
        return dp[len - 1];
    }
}
