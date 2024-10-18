package leetcode.stack;

import java.util.*;

public class leetcode20 {
//          双向链表 pop() 和 push() 模拟栈
    public static  boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) return false;

        Map<Character, Character> map = new HashMap<Character, Character>(){{
            put(')','(');
            put(']','[');
            put('}','{');
        }};
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(("));
    }
}
