package leetcode.DoublePointer;

import java.util.*;
import java.util.stream.Collectors;

public class leetcode15 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
/*//        这个 TLE了
        int n  =nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(-nums[i],i);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n && i != j; j++) {
                if (map.containsKey(nums[i] + nums[j])) {
                    int index = map.get(nums[i] + nums[j]);
                    if (index != i && index != j) {
                        List<Integer> list = new ArrayList<>();
                        list.add(-(nums[i] + nums[j]));
                        list.add(nums[i]);
                        list.add(nums[j]);
                        List<Integer> collect = list.stream().sorted((o1, o2) -> {
                            return o1 - o2;
                        }).collect(Collectors.toList());
                        res.add(collect);
                    }
                }
            }
        }
        List<List<Integer>> collect = res.stream().distinct().collect(Collectors.toList());

        return collect;*/
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            int r = n -1;
            int target = - nums[i];
            for (int l = i +1; l < r; l++) {
                while (nums[l] +nums[r] > target && r > l) {
                    r --;
                }
                if (l == r){
                    break;
                }
                if (nums[l] + nums[r] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    if (!res.contains(list)) {
                        res.add(list);
                    }
                }
            }
        }
        return res;
    }
}
