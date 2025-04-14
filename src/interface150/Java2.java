package interface150;

public class Java2 {

    public int[] solve (int len, int m, int[] a) {
        // write code here
        if (len <= 1) return a;
        // 三次旋转
        m = m % len;
        reverse(a, 0, len - 1);
        reverse(a, 0, m -1);
        reverse(a, m , len - 1);
        return a;
    }

    private void reverse(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l ++;
            r --;
        }
    }

    public static void main(String[] args) {
        Java2 solver = new Java2();
        System.out.println(solver.solve(6, 2, new int[]{1, 2, 3, 4, 5, 6}));
    }
}
