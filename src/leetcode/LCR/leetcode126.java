package leetcode.LCR;

public class leetcode126 {
    public static void main(String[] args) {
        System.out.println(fib(45));
    }
    public static  int fib(int n) {
// 斐波那契数   dp 问题
        if (n == 0) return 0;
        if (n == 1) return 1;
        int res = 0;
        int pre1 = 0, pre2 = 1;
        int i = 0;
        while (i ++ < n - 1) {
            res = pre1 + pre2;
            res %= 1000000007;
            pre1 = pre2;
            pre2 = res;
        }

        return  res;
    }
}
