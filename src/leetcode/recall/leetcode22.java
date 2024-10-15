package leetcode.recall;

import java.util.ArrayList;
import java.util.List;

public class leetcode22 {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        process(list, "", n, 0 , 0);
        return list;
    }

    private void process(List<String> list, String str, int n, int open, int close) {
        if (str.length() == 2*n) {
            list.add(new String(str));
            return;
        }

        if (open < n) {
            process(list, str + "(", n, open + 1, close);
        }
        if (close < open) {
            process(list, str + ")", n, open, close + 1);
        }
    }
}
