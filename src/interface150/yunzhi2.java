package interface150;

import java.util.*;

public class yunzhi2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int l = sc.nextInt();
//        int[] height = new int[n];
//        // Arrays.fill(height, 0);
//        for (int i = 0; i < n; i++) {
//            height[i] = sc.nextInt();
//        }
////        Arrays.sort(height);
////        for (int i = 0; i < n; i++) {
////            if (height[i] <= l) {
////                l ++;
////            }else {
////                break;
////            }
////        }
//        System.out.println(l);
        // hash
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        // 可能会有重复值
        Map<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            min = Math.min(min,val);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (i == 0 && l < min) {
                System.out.println(l);
                return;
            } else if (i == 0 && l >= min) {
                l += map.getOrDefault(min,0);
            } else {
                for (int j = min + 1; j <= l; j ++) {
                    if (map.containsKey(j)) {
                        l += map.getOrDefault(j,0);
                    }
                }
            }
        }
        System.out.println(l);
    }
}
