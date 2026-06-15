package yuxin_2026;

import java.util.Scanner;

/**
 * @author hc
 * @date
 **/
public class third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();

            int cur = 0;
            for (int i = 1; i * i <= n; i++) {
                long product = i *(i + 1);
                if (product % n == 0) {
                    cur++;
                }
            }

            System.out.println(cur);
        }
    }
}
