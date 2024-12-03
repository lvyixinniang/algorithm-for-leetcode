package leetcode.LCR;

public class leetcode134 {
    public static void main(String[] args) {
        myPow(2.0000, 10);
    }
    // todo 很懵
    public static  double myPow(double x, int n) {
        return n >= 0 ? quickMul (x, n) : 1 / quickMul (x , -n);
    }

    private static double quickMul(double x, int n) {
        if (n == 0) return 1.0;
        double y = quickMul(x , n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }


}
