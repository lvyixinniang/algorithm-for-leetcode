package interface150II;

import java.util.Stack;

public class lc71 {

    public String simplifyPath(String path) {
//        todo 根本题目都没看懂
        String[] split = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("") || split[i].equals(".")) {
                continue;
            } else if (split[i].equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(split[i]);
            }
        }
        return "/" + String.join("/", stack);
    }

    public static void main(String[] args) {
        lc71 sol = new lc71();
        System.out.println(sol.simplifyPath("/.../a/../b/c/../d/./"));
    }
}
