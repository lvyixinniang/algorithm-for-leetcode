package interface150II;

import java.util.HashSet;
import java.util.Set;

public class lc202 {

    public boolean isHappy(int n) {
        return isHappy(n, new HashSet<>());
    }

    private boolean isHappy(int n, Set<Integer> seen) {
        if (n == 1) return true;
        if (seen.contains(n)) return false; // 检测到循环

        seen.add(n);
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            sum += digit * digit;
        }
        return isHappy(sum, seen);
    }

    public static void main(String[] args) {
        lc202 lc202 = new lc202();
        System.out.println(lc202.isHappy(7));
    }
}
