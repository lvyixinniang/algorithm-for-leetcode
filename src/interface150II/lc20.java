package interface150II;

import java.util.Stack;

public class lc20 {
    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 == 1) return false;

        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char c1 = stack.pop();
                if (c1 =='(' && c == ')'
                        || c1 =='[' && c == ']'
                        || c1 =='{' && c == '}') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        lc20 lc20 = new lc20();
        System.out.println(lc20.isValid("()"));
    }
}
