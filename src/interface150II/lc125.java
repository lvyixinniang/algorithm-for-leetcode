package interface150II;

public class lc125 {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                sb.append(c);
            }else if (c >= 'A' && c <= 'Z') {
                c = (char) ('a' + (c - 'A'));
                sb.append(c);
            }
        }
        String res = sb.toString();
        return res.equals(sb.reverse().toString());
    }
}
