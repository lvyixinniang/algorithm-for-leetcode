package interface150;

import java.util.*;

public class wangyi2026Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // k 是目前的现金
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] strs = s.split(" ");
            Double[] guPiao = new Double[m];
            for (int j = 0; j < strs.length; j++) {
                guPiao[j] = Double.parseDouble(strs[j]);
            }

        }
    }
}
