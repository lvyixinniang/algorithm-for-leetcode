package PDD2025;

import java.util.*;

public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n -- > 0) {
            int year = sc.nextInt();

            // 纯暴力
            year++;
            while (!judge(year)) {
                year++;
            }
            System.out.println(year);
        }
    }
    private static boolean judge(int year) {
        Set<Integer> set = new HashSet<>();
        while (year > 0) {
            if (set.contains(year % 10)) return false;
            set.add(year % 10);
            year /= 10;
        }
        return true;
    }
}
