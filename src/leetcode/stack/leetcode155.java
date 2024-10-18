package leetcode.stack;

import java.util.ArrayDeque;

public class leetcode155 {

    class MinStack {
        public ArrayDeque<Integer> stack;
        public ArrayDeque<Integer> mins;
        public MinStack() {
            stack = new ArrayDeque<>();
            mins = new ArrayDeque<>();
            mins.push(Integer.MAX_VALUE);
        }

        public void push(int val) {
            stack.push(val);
            mins.push(Math.min(mins.peek(), val));
        }

        public void pop() {
            stack.pop();
            mins.pop();
        }

        public int top() {
         return stack.peek();
        }

        public int getMin() {
            return mins.peek();
        }
    }

}
