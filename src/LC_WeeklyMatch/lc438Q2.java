package LC_WeeklyMatch;

import java.util.*;

public class lc438Q2 {
    public static  long maxSum(int[][] grid, int[] limits, int k) {
        if (k == 0) return 0;
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        long sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < limits.length; i++) {
            for (int j = 0; j < limits[i]; j++) {
                if (list.size() < k) {
                    list.add(grid[i][grid[i].length - j - 1]);
                } else if (list.size() == k) {
                    if (grid[i][grid[i].length - j - 1] > list.get(0)) {
                        list.remove(0);
                        list.add(grid[i][grid[i].length - j - 1]);
                    }
                }
                list.sort(Integer::compare);
            }
        }
        for (int i = 0; i < k; i++) {
            sum += list.get(i);
        }

        return sum;
    }
    public static void main(String[] args) {
//        int[][] grid = new int[][]{{5, 3, 7},{8, 2, 6}};
//        System.out.println(maxSum(grid, new int[]{2, 2}, 3));
//        int[][] grid = new int[][]{{1,2},{3,4}};
//        System.out.println(maxSum(grid, new int[]{1, 2}, 2));
        int[][] grid = new int[][]{{5,8,6,1,6,4}};
        System.out.println(maxSum(grid, new int[]{3}, 3));
    }
}
