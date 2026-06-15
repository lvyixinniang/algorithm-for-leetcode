package didi_2026;

import java.util.*;

/**
 * @author hc
 * @date
 **/
public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] res = new int[n];
        int maxh = 0;
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int d = sc.nextInt();

            // 下方块雨
            while (l <= r) {
                res[l- 1] += d;
                if (l < r )res[r - 1] += d;
                l++;
                r--;
                maxh = Math.max(maxh, Math.max(res[l - 1], res[r - 1]));
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int re : res) {
            map.put(re, map.getOrDefault(re, 0) + 1);
        }
        for (int i = 1; i <= maxh + 1; i++) {
            int currentX = 0;
            for (int j = 0; j < map.size(); j++) {
                Set<Integer> integers = map.keySet();
                for (Integer integer : integers) {
                    if (integer >= i) {
                        currentX += map.get(integer);
                    }
                }
            }
            set.add(currentX);
        }
        System.out.println(set.size());
    }
}
