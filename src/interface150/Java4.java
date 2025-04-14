package interface150;

public class Java4 {

    public int solve (int[] a) {
        // write code here
        if (a == null || a.length == 0) return -1;
        int n = a.length;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                if (a[i] >= a[i - 1]) {
                    ans = i;
                    break;
                }
            }else if (i == 0) {
                if (a[i] >= a[i + 1]) {
                    ans = 0;
                    break;
                }
            }else {
                if (a[i] >= a[i + 1] && a[i] >= a[i - 1]) {
                    ans = i;
                    break;
                }
            }
        }
        return ans;
    }
}
