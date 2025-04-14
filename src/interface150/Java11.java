package interface150;

import java.util.*;

public class Java11 {

    public ArrayList<ArrayList<Integer>> threeSum (int[] num) {
        // write code here
        int len = num.length;
        if (len == 0) return new ArrayList<>();
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < len - 2; i++) {
            int l = i + 1, r = len - 1;
            if (i > 0 && num[i] == num[i - 1]) continue;
            while (l < r) {
                int sum = num[i] + num[l] + num[r];
                if (sum == 0) {
                    res.add(new ArrayList<>(Arrays.asList(num[i], num[l], num[r])));
                    l ++;
                    r--;
                    while (l < r && num[l] == num[l - 1]) l ++;
                    while (l < r && num[r] == num[r + 1]) r --;
                } else if (sum < 0) {
                    l ++;
                    while (l < r && num[l - 1] == num[l]) l ++;
                } else {
                    r --;
                    while (l < r && num[r + 1] == num[r]) r --;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        System.out.println(new Java11().threeSum(num));
    }
}
