package interface150;

import java.util.Scanner;

public class Q1_360_2026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int m = sc.nextInt(), n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
            // 判断方法 至多 一次
            if (s.equals(t)) {
                System.out.println("YES");
                continue;
            }
            // 相当于 S 只有 dc, T 只有 ic
            // 找到S 和 T 第一个不相同的 字符串 ， 进行剪切
            // S : "abcc" , T :"ab"
            int min = Math.min(m, n);
            int begin_index = -1;
            int end_index = -1;
            for (int i = 0; i < min; i++) {
                if (s.charAt(i) != t.charAt(i)) {
                    begin_index = i;
                    end_index = i;
                    int temp = i;
                    while (s.charAt(end_index + 1) != t.charAt(temp)) {
                         end_index++;
                    }
                    break;
                }
            }
            if (begin_index == -1) {
                begin_index = min;
                end_index = Math.abs(m - n) / 2 - 1 + min ;
            }
            // 裁剪 比较两者是否相等
            StringBuilder sbS = new StringBuilder();
            StringBuilder sbT = new StringBuilder();
            sbS.append(s.substring(0, begin_index));
            if (end_index < m) {
                sbS.append(s.substring(end_index + 1, m));
            }
            sbT.append(t);
            if (end_index < n) {
                // 如果 T 字符串更长， 还要包含剩余部分
                sbT.append(s.substring(end_index + 1, n));
            }
            sbT.append(s.substring(begin_index, end_index + 1));
//            System.out.println(sbS.equals(sbT) ? "YES" : "NO");
            System.out.println(sbS.toString().equals(sbT.toString())?"YES":"NO");
        }
    }
}
