package leetcode.LCR;

public class leetcode138 {
// todo DFA 题
    public boolean validNumber(String s) {
        int len = s.length();
        if (len == 1 ) {
            char c = s.charAt(0);
            if (c < 'a' || c > 'z') {
                return false;
            }
        }

        boolean fuhao = true;
        int shuzi = 0; // 0 未开始 1 已开始 2 已结束
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == ' ' && shuzi == 0) {

            }
        }
        return true;
    }
}
