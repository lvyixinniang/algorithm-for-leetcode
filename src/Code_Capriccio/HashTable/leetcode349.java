package Code_Capriccio.HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leetcode349 {
    public static void main(String[] args) {
        System.out.println(intersection(new int[]{1,2,2,1}, new int[]{2,2}));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        // nums1 遍历
        for (int val : nums1) {
            set.add(val);
        }
        // nums2 遍历
        for (int val : nums2) {
            if (set.contains(val)) {
                res.add(val);
            }
        }
        int[] arr = new int[res.size()];
        int count = 0;
        for (int val : res) {
            arr[count ++] = val;
        }
        return arr;
    }
}
