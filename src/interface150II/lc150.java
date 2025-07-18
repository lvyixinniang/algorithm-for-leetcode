package interface150II;

import java.util.Stack;

public class lc150 {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
//                如果他是符号的话
                if (stack.size() > 1) {
                    int x = stack.pop();
                    int y = stack.pop();
                    int temp = 0;
                    switch (token) {
                        case "+":
                            temp += x + y;
                            break;
                        case "-":
                            temp += y - x;
                            break;
                        case "*":
                            temp += x * y;
                            break;
                        case "/":
                            temp += y / x;
                            break;
                        default:
                            break;
                    }
                    stack.push(temp);
                }
            }else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        lc150 lc150 = new lc150();
        System.out.println(lc150.evalRPN(new String[]{"4","13","5","/","+"}));
    }
}
