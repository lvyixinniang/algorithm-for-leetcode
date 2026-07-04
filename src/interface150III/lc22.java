package interface150III;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hc
 * @date
 **/
public class lc22 {
// todo 如何控制
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(), 0, 0, n);
        return res;
    }

    private void backtrack(List<String> res, StringBuilder sb, int open, int close, int n) {
        if (sb.length() == 2 * n) {
            res.add(sb.toString());
            return;
        }
        // 可以添加左括号的条件：左括号数量 < n
        if (open < n) {
            sb.append('(');
            backtrack(res, sb, open + 1, close, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        // 可以添加右括号的条件：右括号数量 < 左括号数量
        if (close < open) {
            sb.append(')');
            backtrack(res, sb, open, close + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
