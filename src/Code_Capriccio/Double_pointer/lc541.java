package Code_Capriccio.Double_pointer;

public class lc541 {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
    public static String reverseStr(String s, int k) {
        int len = s.length();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < len; i += (2 * k)) {
            if (k <= (len - i)) {
                reverseStr(charArray, i, i + k - 1);
            } else if ((len - i) < k) {
                reverseStr(charArray, i, len - 1);
            }
        }
        return String.valueOf(charArray);
    }

    private static void reverseStr(char[] charArray, int l, int r) {
        for (;l < r; l++ , r--) {
            char c = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = c;
        }
    }
}
