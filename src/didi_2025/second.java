package didi_2025;

import java.util.*;

public class second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n -1];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = sc.nextInt();
            }
            Map<Integer,Integer> map = new HashMap<>();
            map.put(-1,1);
            int count = 0;
            int max = 0;
            for (int i : arr) {
                map.put(i,map.getOrDefault(i,0)+1);
                if (map.get(i) > 1) {
                    count ++;
                    max = Math.max(max,map.get(i));
                }
            }
            int time = 0;
            int jishu = 0;
            while (n > 0) {
                time++;
                n --;
                if (jishu < count) {
                    jishu++;
                    n -= 1;
                }
            }
            System.out.println(time);
        }
    }
}
