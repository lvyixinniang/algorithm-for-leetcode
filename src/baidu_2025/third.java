package baidu_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            List<Integer> list = new ArrayList<>();
            list.add(-1);
            for (int i = 0; i < s.length(); i++) {
                int x = s.charAt(i) - '0';
                list.add(x);
            }

            int tures = 0, falses = 0;
            for (int i = 1; i <= n; i++) {
                if (list.get(i) == list.get(n - i + 1)) {
                    tures++;
                } else {
                    falses++;
                }
            }
            if (tures == k) {
                System.out.println("0");
            }
            long sum = 0;
            int count = k - tures;
            for (int j = 1; j <= m; j++) {
                // Cj count

            }
        }
    }
}
