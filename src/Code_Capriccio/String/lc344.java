package Code_Capriccio.String;

public class lc344 {
    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        // 双指针
        int l = 0, r = s.length -1;
        while (l < r) {
            if (l == r) break;
            char c = s[l];
            s[l] = s[r];
            s[r] = c;
            l ++;
            r --;
        }
    }
}
