package interface150;

import java.util.*;
public class yunzhi1 {
    // 注意类名必须为 Main, 不要有任何 package xxx 信
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int tcount = 0;
            while(t -- > 0) {
                int n = sc.nextInt();
                int l = sc.nextInt();
                int r = sc.nextInt();
                // l 向上取整
                double down = 1.0 * l / n;
                if (down > Math.floor(down)) {
                    down = Math.floor(down) + 1;
                }
                // r 向下取整
                double upper = 1.0 * r / n;
                if (upper > Math.floor(upper)) {
                    upper = Math.floor(upper);
                }
                // 比较
                if (down > upper) {
                    System.out.println("-1");
                } else if (down <= upper) {
                    System.out.println((int)down + " "+(int)upper);
                }
            }
        }

}
