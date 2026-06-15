package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc5 {
// todo 清楚思路, 但要怎么实现却不知道 8/31日 重做 2026/4/16
    public String longestPalindrome(String s) {
        int len = s.length();
        String res = s.substring(0,1);
        // 奇数
        for (int i = 0; i < len; i++) {
            int count = 1;
            while (i - count >= 0 && i + count < len) {
                if (s.charAt(i - count ) == s.charAt(i + count)) {
                    count++;
                    if (2 * count - 1 > res.length()) {
                        res = s.substring(i - count + 1, i + count);
                    }
                } else {
                    break;
                }
            }

            // 偶数
            int l = i, r = i + 1;
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > res.length()) {
                    res = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        lc5 lc5 = new lc5();
        System.out.println(lc5.longestPalindrome("babad"));
    }
}
