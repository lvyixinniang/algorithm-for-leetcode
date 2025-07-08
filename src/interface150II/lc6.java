package interface150II;

import java.util.ArrayList;
import java.util.List;

public class lc6 {

    public String convert(String s, int numRows) {
        // todo 第一次 思想不对
        if (numRows == 1) return s;
        int len = s.length();
        List<StringBuffer> list = new ArrayList<StringBuffer>();
        for (int i = 0; i < numRows; i++) {
            StringBuffer sb = new StringBuffer();
            list.add(sb);
        }
        int ahead = 0;
        boolean flag = true;
        for (int i = 0; i < len; i++) {
            list.get(ahead).append(s.charAt(i));
            if (ahead == numRows - 1) {
                flag = false;
            } else if (ahead == 0) {
                flag = true;
            }
            if (flag) {
                ahead++;
            }else {
                ahead--;
            }
        }
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            res.append(list.get(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        lc6 lc6 = new lc6();
        System.out.println(lc6.convert("AB", 1));
    }
}
