package leetcode.LCR;

public class leetcode121 {
    public static void main(String[] args) {
        findTargetIn2DPlants(new int[0][0], 1);
    }

    public static  boolean findTargetIn2DPlants(int[][] plants, int target) {
        // 二分法
        // 逐行 二分
        if (plants.length == 0 || plants[0].length == 0) return false;
        int len = plants[0].length;
        for (int[] plant : plants) {
            int l = 0, r = len - 1;
            int mid = 0;
            if (plant[0] > target) break;
            while (l <= r) {
                mid = (r - l) / 2 + l;
                if (plant[mid] == target) return true;
                else if (plant[mid] > target) r = mid - 1;
                else if (plant[mid] < target) l = mid + 1;
            }
        }

        return false;
    }
}
