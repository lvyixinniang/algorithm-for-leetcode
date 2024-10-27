package leetcode.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class leetcode763 {
    public List<Integer> partitionLabels(String s) {
        int len = s.length();
        int[][] pairs = new int[256][2];
        for (int i = 0; i < len; i++) {
            final  char c = s.charAt(i);
            int[] pair = pairs[c];
            if (pair[0] == 0) {
                pair[0] = i + 1;
            }
            pair[1] = i + 1;
        }

        List<int[]> list = new ArrayList<>();
        for (int[] pair : pairs) {
            if (pair[0] != 0) {
                list.add(pair);
            }
        }
        list.sort(Comparator.comparing(o -> o[0]));

        List<Integer> res = new ArrayList<>();
        int l = list.get(0)[0];
        int r = list.get(0)[1];
        for (int i = 1; i < list.size(); i++) {
            int newl = list.get(i)[0];
            int newr = list.get(i)[1];
            if (newl > r) {
                res.add(r - l + 1);
                l = newl;
                r = newr;
            }else {
                r = Math.max(r, newr);
            }
        }
        res.add(r - l + 1);
        return res;
    }
}
