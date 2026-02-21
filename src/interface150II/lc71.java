package interface150II;

import java.util.Stack;

public class lc71 {
    //        todo 根本题目都没看懂
    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String s : split) {
            if (s.equals("") || s.equals(".")) {
                continue; // 不处理
            } else if (s.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(s);
            }
        }
        return "/" +String.join("/",stack);
    }

    public static void main(String[] args) {
        lc71 sol = new lc71();
        System.out.println(sol.simplifyPath("/.../a/../b/c/../d/./"));
    }
}
