package baidu_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        long maxx = 0, minn = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
            maxx = Math.max(maxx, x);
            minn = Math.min(minn, x);
        }
        if (maxx <= 2 * minn) {
            System.out.println(0);
            return;
        }

        boolean flag = false;

        int operation = 0;
        while (!flag) {
            int maxval = 0, minval = Integer.MAX_VALUE;
            for (int i = 0; i < list.size(); i++) {
                maxval = Math.max(maxval, list.get(i));
                minval = Math.min(minval, list.get(i));
            }
            if (minval * 2 >= maxval) {
                flag = true;
                continue;
            }

            operation ++;
            list.remove(Integer.valueOf(maxval));
            if (maxval - 2 * minval < minval) {
                // 分奇偶
                if (maxval % 2 == 1) {
                    list.add(maxval / 2);
                    list.add(maxval / 2 + 1);
                } else {
                    list.add(maxval / 2);
                    list.add(maxval / 2);
                }
            } else {
                list.add(2 * minval);
                list.add(maxval - 2 * minval);
            }
        }
        System.out.println(operation);
    }
}
