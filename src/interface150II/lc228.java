package interface150II;

import java.util.*;

public class lc228 {
    public List<String> summaryRanges(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<String> res = new ArrayList<>();
        for (Integer num : set) {
            int temp = num;
            if (num == Integer.MIN_VALUE || !set.contains(temp - 1)) {
                StringBuilder sb = new StringBuilder();
                int start = temp;
                while (temp != Integer.MAX_VALUE && set.contains(temp + 1)) {
                    temp++;
                }
                res.add(start == temp ?
                        String.valueOf(start) :
                        start + "->" + temp
                );
            }
        }

        return res;
    }

    public static void main(String[] args) {
        lc228 lc228 = new lc228();
        System.out.println(lc228.summaryRanges(new int[]{-2147483648,-2147483647,2147483647}));
    }
}
