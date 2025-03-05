package interface150;

public class lc33 {

    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 1) return nums[0] == target ? 0 : -1;
        int l = 0 , r = len - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                }else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        lc33 lc33 = new lc33();
//        int[] nums1 = {6,7,0,1,2,4,5};
//        System.out.println(lc33.search(nums1, 7));

        int[] nums3 = {4,5,6,7,0,1,2};
        System.out.println(lc33.search(nums3, 0));

//        int[] nums2 = {3,1};
//        System.out.println(lc33.search(nums2, 1));
    }
}
