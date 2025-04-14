package interface150;

public class zijie7 {
    public int search (int[] nums, int target) {
        // write code here
        int len = nums.length;
        if (len == 0) return -1;
        int l = 0, r = len - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                if (mid - 1 >= 0 && nums[mid - 1] == target) {
                    while (mid >= 0 && nums[mid] == target) {
                        mid --;
                    }
                    mid += 1;
                }

                return mid;
            } else if (nums[mid] < target){
                l = mid + 1;
            } else {
                r= mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        zijie7 z = new zijie7();
        System.out.println(z.search(new int[]{-2, -2,-2}, -2));
    }
}
