package leetcode.LCR;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LCR004 {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{0,1,0,1,0,1,100}));
    }

    public static  int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num) && map.get(num) == 2) {
                map.remove(num);
            }else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        for (Integer integer : map.keySet()) {
            return integer;
        }
        return 0;
    }
}
