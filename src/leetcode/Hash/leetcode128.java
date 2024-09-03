package leetcode.Hash;

import java.util.*;

public class leetcode128 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}));
    }
    public static  int longestConsecutive(int[] nums) {
//        这是使用MAp来实现的 , 主要一开始,我是想到SET虽然可以不进行去重, 但没法记录当前的长度,所以才使用的这么一个双列集合
        /*if (nums.length == 0){
            return 0;
        }

        int[] array = Arrays.stream(nums).distinct().toArray();
        Arrays.sort(array);
        Map<Integer, Integer> map = new HashMap<>();

        int max = 1;
        for (int num : array) {
            int len = 1;
            if (map.containsKey(num-1)) {
                len = map.getOrDefault(num-1,1)+1;
                max = max<len?len:max;
            }
            map.put(num,len);
        }
        return max;*/

//        这是 使用的SET集合来完成
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res =0 ;
        int count = 0;
        for (Integer n : set) {

            if (set.contains(n)){
//                拥有 前一个
                count =1 ;
                int curr = n;
                while (set.contains(curr+1)){
                    curr ++;
                    count ++;
                }
                res = Math.max(count,res);
            }
        }
        return res;
    }
}
