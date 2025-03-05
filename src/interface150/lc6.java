package interface150;

import java.util.ArrayList;
import java.util.List;

public class lc6 {

    public static String convert(String s, int numRows) {
        if (numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {rows.add(new StringBuilder());}

        StringBuilder sb = new StringBuilder();
        int count = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(count).append(c);
            if (count == 0 || count == numRows - 1) {
                flag = -flag;
            }
            count += flag;
        }
        for (int i = 0; i < numRows; i++) {
            sb.append(rows.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }
}
