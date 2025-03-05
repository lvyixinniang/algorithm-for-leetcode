package interface150;

public class lc34 {

    public int[] searchRange(int[] nums, int target) {
        // 二分 + 双指针
        int len = nums.length;
        int l = 0, r = len - 1;
        int key = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                key = mid;
                break;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (key == -1) {
            return new int[]{-1, -1};
        }
        int left = key , right = key;
        for (int i = left; i >= 0 ; i--) {
            if (nums[i] == target) {
                left = i;
            } else {
                break;
            }
        }
        for (int i = right; i < len ; i++) {
            if (nums[i] == target) {
                right = i;
            } else {
                break;
            }
        }

        return new int[]{left, right};
    }
    public static void main(String[] args) {
        lc34 lc34 = new lc34();
        System.out.println(lc34.searchRange(new int[]{1}, 1));
        System.out.println(lc34.searchRange(new int[]{5,7,7,8,8,10}, 8));
        System.out.println(lc34.searchRange(new int[]{5,7,7,8,8,10}, 6));
    }
}
