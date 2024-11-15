package leetcode.HOT200;

public class leetcode8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("+ 1"));
    }
    public static  int myAtoi(String s) {
        int len = s.length();
        long res = 0;
        int is_negative = 0; // 0 没找到符号位， 1为 ‘+’ ， -1 为 ‘-1’
        boolean is_number = false;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if ((c == '-' || c == '+') && is_number == false) {
                if (is_negative != 0) return 0;
                is_negative = c == '-' ? -1 : 1;
            } else if (c >= '0' && c <= '9') {
                is_number = true;
                res *= 10;
                res += (c - '0');
                if (is_negative == -1 && res * is_negative <= Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                } else if (is_negative != -1 && res >= Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            } else if (c == ' ' && is_number == false && is_negative == 0) {
                continue;
            } else {break;}
        }

        return is_negative == -1 ? -1 * (int) res : (int) res;
    }
}
