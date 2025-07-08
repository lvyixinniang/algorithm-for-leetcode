package interface150II;

import java.util.ArrayList;
import java.util.List;

public class lc151 {

    public String reverseWords(String s) {
        List<String> list = new ArrayList<String>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                while (i < s.length() && s.charAt(i) == ' ') {
                    i ++;
                }
            }

                StringBuffer temp = new StringBuffer();
                while (i < s.length() && s.charAt(i) != ' ') {
                    temp.append(s.charAt(i));
                    i++;
                }
                if (temp.length() > 0) {
                    list.add(temp.toString());
                }
        }

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(list.size() - 1 - i));
            if (i < list.size() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        lc151 solution = new lc151();
        System.out.println(solution.reverseWords("  hello world  "));
    }
}
