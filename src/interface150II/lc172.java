package interface150II;

public class lc172 {


    public int trailingZeroes(int n) {
        // 由 2 和 5
        int count2 = 0;
        int temp = n;
        while (temp > 0) {
            temp /= 2;
            count2 += temp;
        }

        temp = n;
        int count5 = 0;
        while (temp > 0) {
            temp /= 5;
            count5 += temp;
        }
        return Math.min(count2, count5);
    }

}
