package interface150II;

import java.util.ArrayList;
import java.util.List;

public class lc22 {
//      todo 没想到办法 8/28日重做（不会）
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 1) {
            res.add("()");
            return res;
        }
        backTrace(n, 0, res, new StringBuilder());
        return res;
    }

    private void backTrace(int n, int index, List<String> res, StringBuilder stringBuilder) {
        if (index == n) {
            res.add(stringBuilder.toString());
            return;
        }

    }

    public static void main(String[] args) {
        lc22 lc22 = new lc22();
        System.out.println(lc22.generateParenthesis(3));
    }
}
