package leetcode.LCR;

import sun.font.DelegatingShape;

import java.util.ArrayDeque;
import java.util.Queue;

public class LCR148 {
//  putIn 是顺序的
    public static  boolean validateBookSequences(int[] putIn, int[] takeOut) {
        // 先初始化 栈
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        int len = putIn.length;
        if (len == 1) return true;
        int removed = 0;
        int inIndex = 0; // putIn 的 索引
        for (int out : takeOut) {
            if (stack.isEmpty() || (!stack.isEmpty() && stack.getLast() != out)) { // 多余
                for (; inIndex < len; inIndex++) {
                    if (putIn[inIndex] != out) {
                        stack.addLast(putIn[inIndex]);
                    }else if(putIn[inIndex] == out) {
                        stack.addLast(putIn[inIndex++]);
                        break;
                    }
                }
            }
            if (stack.getLast() == out) {
                stack.removeLast();// pop
                continue;
            }else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(validateBookSequences(new int[]{2,1,0}
                , new int[]{1,2, 0}));
    }
}
