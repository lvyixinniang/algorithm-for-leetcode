package leetcode.DoublePointer;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class leetcode42 {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
    public static int trap(int[] height) {
        int n = height.length;
        int[] flew = new int[n + 1];
        Arrays.fill(flew , 0);

        for (int i = 0; i < n; i++) {
            flew[i] = height[i];
        }

        Deque<Integer> stack = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            while (!stack.isEmpty() && flew[stack.peek()] < flew[i]) {
//               25 , 26 行, 代码的作用是 去除 栈中只有一个 元素的情况 , 因为, 这种 不可能有面积能生成
                int  currIndex = stack.pop();
                if (!stack.isEmpty()){
                    int with = i - stack.peek() -1;
                    int h = Math.min(flew[i], flew[stack.peek()]) - flew[currIndex];
                    sum += with * h;
                }
            }
            stack.push(i);
        }
        return  sum;
    }
}
