package interface150;

import java.util.ArrayList;
import java.util.List;

public class lc22 {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) return res;
        StringBuilder sb = new StringBuilder();
        backStracking (n, 0, 0, sb, res);
        return res;
    }

    private void backStracking(int n, int start, int end, StringBuilder sb, List<String> res) {
        if (sb.length() == n * 2) {
            res.add(sb.toString());
            return;
        } else{
            if (start < n) {
                sb.append('(');
                backStracking(n, start + 1, end, sb, res);
                sb.deleteCharAt(sb.length() - 1);
            }
            if (end < start) {
                sb.append(')');
                backStracking(n, start, end + 1, sb, res);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
