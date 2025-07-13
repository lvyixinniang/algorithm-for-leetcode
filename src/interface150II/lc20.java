package interface150II;

import java.util.Stack;

public class lc20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (c == ')' && pop != '(') {
                    return false;
                } else if (c == '}' && pop != '{') {
                    return false;
                }else if (c == ']' && pop != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
