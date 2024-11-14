package leetcode.stack;

import java.util.Arrays;

public class leetcode739 {
    public static void main(String[] args) {
        System.out.println(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

    public static  int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] answer = new int[len];
        int[] next = new int[101];
        Arrays.fill(next, Integer.MAX_VALUE);
        for (int i = len - 1; i >= 0; i--) {
            int warmerIndex = Integer.MAX_VALUE;
            for (int j = temperatures[i] + 1; j <= 100; j++) {
                if (next[j] < warmerIndex) {
                    warmerIndex = next[j];
                }
            }
            if (warmerIndex < Integer.MAX_VALUE) {
                answer[i] = warmerIndex - i;
            }
            next[temperatures[i]] = i;
        }

        return answer;
    }
}
