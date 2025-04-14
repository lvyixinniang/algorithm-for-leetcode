package interface150;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_360_2026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            String t = sc.next();
            String[] split1 = s.split("/");
            long x1 = Long.parseLong(split1[0]);
            long y1 = Long.parseLong(split1[1]);
            String[] split2 = t.split("/");
            long x2 = Long.parseLong(split2[0]);
            long y2 = Long.parseLong(split2[1]);
            // 判断 是否 都只 删除了 同一元素
            int[] arr1 = new int[26];
            int[] arr2 = new int[26];
            int[] arr3 = new int[26];
            int[] arr4 = new int[26];
            //先判断分子
            for (int i = 0; i < split1[0].toCharArray().length; i++) {
                arr1[split1[0].toCharArray()[i] - '0']++;
            }
            for (int i = 0; i < split1[1].toCharArray().length; i++) {
                arr2[split1[1].toCharArray()[i] - '0']++;
            }
            for (int i = 0; i < split2[0].toCharArray().length; i++) {
                arr3[split2[0].toCharArray()[i] - '0']++;
            }
            for (int i = 0; i < split2[1].toCharArray().length; i++) {
                arr4[split2[1].toCharArray()[i] - '0']++;
            }
            boolean flag = true;

            for (int i = 0; i < 26; i++) {
                if (arr1[i] - arr3[i] != arr2[i] - arr4[i]) {
                    flag = false;
                }
            }
            if (flag) {
                if (x1/y1 == x2/y2) {
                    System.out.println("YES");
                }
            }else {
                System.out.println("NO");
            }
        }
    }
}
