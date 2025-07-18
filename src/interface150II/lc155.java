package interface150II;

import java.util.*;

//    todo 根本没想到什么常数级 查询最小元素
class  MinStack {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        xStack.push(val);
        minStack.push(Math.min(val, minStack.peek()));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        // 测试序列: ["MinStack","push","push","push","getMin","pop","top","getMin"]
        // 输入参数: [[],[-2],[0],[-3],[],[],[],[]]

//        Deque<Integer> stack = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}

