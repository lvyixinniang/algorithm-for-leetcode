package Code_Capriccio.Double_pointer;

public class lc344 {

    public void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; 2 * i < len; i++) {
            char c = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = c;
        }
    }
}
