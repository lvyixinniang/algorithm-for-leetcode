package interface150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class tuan7 {

    public int MLS (int[] arr) {
        // write code here
        if (arr == null || arr.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int count = 1;
        for (Integer i : set) {
            if (set.contains(i + 1)) {
                int acount = 2;
                int val = i + 1;
                while (set.contains(val + 1)) {
                    val = val + 1;
                    acount++;
                }
                count = Math.max(count, acount);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        tuan7 tuan7 = new tuan7();
        System.out.println(tuan7.MLS(new int[]{100,4,200,1,3,2}));
    }
}
