package interface150II;

public class lc69 {
//    todo 4/21 存在不知道高效算法的问题
    public int mySqrt(int x) {
//        二分
        int l = 0, r = x;
        int mid = 0;
        int ans= 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if ((long)mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }


}
