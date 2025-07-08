package interface150II;

public class lc392 {

    public boolean isSubsequence(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        int sindex = 0;
        for (int i = 0; i < tlen; i++) {
            char c = t.charAt(i);
            if (sindex == slen) {
                return true;
            }
            if (c == s.charAt(sindex)) {
                sindex++;
            }
        }
        return sindex == slen;
    }
}
