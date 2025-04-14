package interface150;

import java.util.*;

public class tuan9 {

    public ArrayList<ArrayList<Integer>> threeSum (int[] num) {
        // write code here
        if (num == null || num.length < 3) return new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int len = num.length;
        Arrays.sort(num);
        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && num[i] == num[i - 1]) continue;
            int left = i + 1, right = len - 1;
            int sum = num[i];
            while (left < right) {
                if (num[left] + num[right] == -sum) {
                    res.add(new ArrayList<>(Arrays.asList(num[i], num[left], num[right])));
                    while (num[left] == num[left + 1]) left++;
                } else if (num[left] + num[right] < -sum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        tuan9 tuan9 = new tuan9();
        System.out.println(tuan9.threeSum(new int[]{-2,0,0,2,2}));
    }
}
