package yuxin_2026;

import java.util.Scanner;

/**
 * @author hc
 * @date
 **/
public class second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextInt();

        while (n -- > 0) {
            long a = sc.nextInt();

            if (x >= a) {
                x += a;
                continue;
            } else {
                x += gcd(a, x);
            }
        }
        System.out.println(x);
    }

    private static long lcr(long a, long x) {
        // 辗转相除
        long yushu = a % x;
        if (yushu == 0) {
            return x;
        }

        return lcr(x, yushu);
    }

    private static long gcd(long a, long x) {
        // gcd(大数 - 小数， 小数）
        a = Math.abs(a);
        x = Math.abs(x);

        if (a == x) return a;
        return a > x ? gcd(a - x, x) : gcd(a, x- a);

    }
}
