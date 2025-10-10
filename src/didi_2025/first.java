package didi_2025;

import java.util.*;

public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();

        if (b - a + 1 < k) {
            return;
        }

        List<Integer> res = new ArrayList<>();
        // 数字范围
        for (int i = l; i <= r; i++) {
            // 逐个判断
            int count = 0;
            for(int j = a; j <= b; j++) {
                if (count >= k) {
                    break;
                }
                count += judge(i, j);
            }
            if (count >= k) {
                res.add(i);
            }
        }


//        Collections.sort(res);
        for (Integer re : res) {
            System.out.println(re);
        }
    }

    private static int judge(int i, int j) {
        // i 是数字 ， j 为进制
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        boolean flag = false;
        int yushu = 0;
        int chushu = i;
        while (chushu > 0) {
            int temp = chushu;
            chushu = chushu / j;
            yushu = temp - chushu * j;
            map.put(yushu, 1);
            list.add(yushu);
        }
        flag = judgeflag(list);
        return map.size() <= 2 && flag ? 1 : 0;
    }

    private static boolean judgeflag(List<Integer> list) {
        int len = list.size();
        for (int i = 2; i < len; i ++) {
            if (list.get(i) != list.get(i - 2)) {
                return false;
            }
        }
        return true;
    }
}
