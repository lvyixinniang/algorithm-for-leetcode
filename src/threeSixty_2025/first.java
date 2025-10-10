package threeSixty_2025;

import java.util.*;

public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int m = sc.nextInt();//s的字符串长度
            int n = sc.nextInt();//t的字符串长度
            String s = sc.next();
            String t = sc.next();
            // 先找到【l,r】在s删除， 加在t背后
            int l = 0, r = 0;
            int sindex = 0, tindex = 0;
            while (sindex < m && tindex < n) {
                if (s.charAt(sindex) == t.charAt(tindex)) {
                    sindex++;
                    tindex++;
                } else {
                    l = sindex;
                    sindex++;
                    if (sindex < n && s.charAt(sindex) == t.charAt(tindex)) {
                        r = sindex-1;
                        break;
                    }
                }
            }

            r = r == 0? sindex - 1 : r;

            StringBuilder ssb = new StringBuilder(s);
            StringBuilder tsb = new StringBuilder(t);
            if (r - l + 1 == m - sindex - 1 || (m - 1-sindex == 0 && (r-l+1) % 2 == 0)) {
                boolean flag1 = false, flag2 = false;
                StringBuilder temp = new StringBuilder();
                if (r - l + 1 == m - sindex - 1) {
                    for (int i = l; i <= r; i++) {
                        temp.append(ssb.charAt(i));
                        ssb.deleteCharAt(i);
                    }
                    tsb.append(temp.toString());
                    flag1 = tsb.toString().equals(ssb.toString()) ? true : false;
                }
                if (m - 1-sindex == 0 && (r-l+1) % 2 == 0) {
                    for (int i = l; i <= (l + r) / 2; i++) {
                        temp.append(ssb.charAt(i));
                        ssb.deleteCharAt(i);
                    }
                    tsb.append(temp.toString());
                    flag2 = tsb.toString().equals(ssb.toString()) ? true : false;
                }
                System.out.println(flag1 || flag2 ? "YES" : "NO");
            } else {
                System.out.println("NO");
            }
        }
    }
}
