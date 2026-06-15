package interface150II;

/**
 * @author hc
 * @date
 **/
public class lc50 {
// todo 不会
    public double myPow(double x, int n) {
        if(x == 0) {
            return 0;
        }
//        x ^ n
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                long longN = -(long)n;
                return 1.0 / (myPowHelper(x, (int)(longN - 1)) * x);
            }
            return 1.0 / myPowHelper(x, -n);
        }
        return myPowHelper(x,n);
    }

    private double myPowHelper(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double half = myPowHelper(x, n / 2);

        // 根据n的奇偶性返回结果
        if (n % 2 == 0) {
            return half *half;
        } else {
            return half * half * x;
        }
    }
}
