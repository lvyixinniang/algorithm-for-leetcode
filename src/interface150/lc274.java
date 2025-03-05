package interface150;

import java.util.Arrays;

public class lc274 {

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        int maxx = 0;
        for (int i = 0; i < len; i++) {
            if (len - i <= citations[i]) {
                maxx = Math.max(maxx, len - i);
            }
        }
        return maxx;
    }
    public static void main(String[] args) {
//        System.out.println(hIndex(new int[]{0, 0, 2}));
//        System.out.println(hIndex(new int[]{0}));
//        System.out.println(hIndex(new int[]{100}));
        System.out.println(hIndex(new int[]{100, 101}));
    }
}
