package interface150II;

import java.util.*;

//    todo 根本没想到什么常数级 查询最小元素 2025/7/19(重做）
class  MinStack {
    Stack<Integer> stack ;
    Stack<Integer> minStack; // 当前最小

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (!minStack.isEmpty()) minStack.push(Math.min(val, minStack.peek()));
        else minStack.push(val);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
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

