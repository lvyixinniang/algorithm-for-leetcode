package meituan_2026;

import java.util.Scanner;

/**
 * @author hc
 * @date
 **/
public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        // l ~ r
        int countX = 0;

        for (int i = l; i <= r; i++) {
            int currCount = 0;
            // 查询因子数量
            currCount = search(i);
            if (currCount % 2 == 1) {
                countX++;
            }
        }
        System.out.println(countX);
    }

    private static int search(int x) {
        int low = (int) Math.sqrt(x);
        return low * low == x ? 1 : 0;
    }
}
