package leetcode.HOT200;

public class leetcode7 {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
    public static  int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        int value = x;
        boolean is_negative = x >= 0 ? false : true;
        value = Math.abs(value);
        while (value >= 1) {
            sb.append(value % 10);
            value /= 10;
        }
        int res = 0;
        for (int i = 0; i < sb.length(); i++) {
            if ((long)res * 10 >= Integer.MAX_VALUE ) return 0;
            res *= 10;
            res += (sb.charAt(i) - '0');
        }

        return is_negative ? -1 * res : res;
    }
}
