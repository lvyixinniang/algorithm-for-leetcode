import java.util.*;


public class lc977 {
    public int[] sortedSquares(int[] nums) {
        // 先划分两个数组
        List<Integer> morelist = new ArrayList<>();
        List<Integer> littlelist = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                littlelist.add(nums[i]);
            } else {
                morelist.add(nums[i]);
            }
        }
        reverseList(littlelist);
        int m = 0, l = 0;
        int[] res = new int[nums.length];
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            int m2 = morelist.get(m) * morelist.get(m);
            int l2 = littlelist.get(l) * littlelist.get(l);
            if (m2 >= l2) {
                res[m + l] = l2;
                l ++;
            } else {
                res[m + l] = m2;
                m ++;
            }
            if (l >= littlelist.size()) {
                flag = true;
                break;
            } else if (m >= morelist.size()) {
                flag = false;
                break;
            }
        }
        if (flag) {
            // m
            for (; m < morelist.size(); m++) {
                res[m + l] = morelist.get(m);
            }
        } else {
            // l
            for (;l < littlelist.size(); l++) {
                res[m + l] = littlelist.get(l);
            }
        }

        return res;
    }

    private void reverseList(List<Integer> list) {
        int l = 0, r = list.size() - 1;
        while (l < r) {
            int temp = list.get(l);
            list.set(l, list.get(r));
            list.set(r, temp);
        }
    }

    public static void main(String[] args) {
        lc977 solution = new lc977();
        System.out.println(solution.sortedSquares(new int[]{-4, -1,0, 3, 10}));
    }
}
