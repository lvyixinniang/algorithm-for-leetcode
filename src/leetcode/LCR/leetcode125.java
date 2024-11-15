package leetcode.LCR;

import java.util.ArrayDeque;

public class leetcode125 {

    class CQueue {
        public ArrayDeque<Integer> stack ;

        public CQueue() {
            stack =  new ArrayDeque<Integer>();
        }

        public void appendTail(int value) {
            stack.addFirst(value);
        }

        public int deleteHead() {
            if (stack.isEmpty()) return -1;
            return stack.removeLast();
        }
    }
}
