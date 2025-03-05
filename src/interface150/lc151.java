package interface150;

import java.util.ArrayList;
import java.util.List;

public class lc151 {

    public static  String reverseWords(String s) {
        String[] s1 = s.split(" ");
        List<String> list = new ArrayList<>();
        for (String string : s1) {
            if (string.length() > 0) list.add(string);
        }
        StringBuffer sb = new StringBuffer();
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i == 0) {
                sb.append(list.get(i));
            } else {
                sb.append(list.get(i) + " ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("  the sky is  blue  "));
    }
}
