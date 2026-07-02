package interface150III;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author hc
 * @date
 **/
public class lc274 {

    public int hIndex(int[] citations) {
        // 判断数组中有多少
        Arrays.sort(citations); // 如何翻转
        int n = citations.length;
        int res = 0;
        for (int i = n - 1; i >= 0; i--) {
            // 逐一
            int h = n - i;
            if (citations[i] >= h) {
                res = h;
                continue;
            } else {
                return h - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc274 lc274 = new lc274();
        System.out.println(lc274.hIndex(new int[]{1}));
    }
}
