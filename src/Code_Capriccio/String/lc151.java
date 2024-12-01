package Code_Capriccio.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
    public static String reverseWords(String s) {
        String res = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                while (c == ' ') {
                    i ++;
                    if (i == s.length()) break;
                    c = s.charAt(i);
                }
            }
            if (c != ' ') {
                StringBuilder sb = new StringBuilder();
                while (c != ' ') {
                    sb.append(c);
                    i ++;
                    if (i == s.length()) break;
                    c = s.charAt(i);
                }
                list.add(sb.toString());
            }
        }

        for (int i = list.size() - 1; i > 0; i--) {
            String remove = list.remove(i);
            res += remove;
            res += " ";
        }
        String remove = list.remove(0);
        res += remove;

        return res;
    }
}
