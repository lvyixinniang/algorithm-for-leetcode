package meituan2025;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class one {

    public static void main(String[] args) {
//        1，插入到任意位置
//        2.删除任意字符
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
//            二维数组
            int[][] dp = new int[n + 1][n + 1];
//            最多次数 肯定是 n-1



        }
    }
    // 判断是否协调
    private boolean judge(String str) {
        boolean big = false, small = false, exist = true;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.toCharArray().length; i++) {
            char c = str.toCharArray()[i];
            if (set.contains(c)) {
                exist = false;
                return false; // 不协调
            }
            if (c >= 'A' && c <= 'Z') {
                big = true;
            }
            if (c >= 'a' && c <= 'z') {
                small = true;
            }
        }
        return exist && big && small;
    }
}
