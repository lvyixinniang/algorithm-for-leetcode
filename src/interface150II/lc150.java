package interface150II;

import java.util.Stack;

public class lc150 {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                stack.push(pop2 + pop1);
            } else if (token.equals("-")) {
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                stack.push(pop2 - pop1);
            } else if (token.equals("*")) {
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                stack.push(pop2 * pop1);
            } else if (token.equals("/")) {
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                stack.push(pop2 / pop1);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        lc150 lc150 = new lc150();
        System.out.println(lc150.evalRPN(new String[]{"4","13","5","/","+"}));
    }
}
