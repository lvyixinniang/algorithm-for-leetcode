package interface150II;

import java.util.Arrays;

public class lc274 {

    public int hIndex(int[] citations) {
        int maxh = citations.length;
        int h = 0;
        Arrays.sort(citations);
        for (int i = 0; i < maxh; i++) {
            h = maxh - i;// 5,4,3,2,1
            boolean flag = citations[i] >= h;
            if (flag) {
                return h;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        lc274 lc274 = new lc274();
        System.out.println(lc274.hIndex(new int[]{3,0,6,1,5}));
//        System.out.println(lc274.hIndex(new int[]{1,3,1}));
    }
}
