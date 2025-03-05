package written_test;

public class tent_miusic2024 {
    public static int cntOfTrees (int n) {
        // write code here
        if (n % 2 == 0) {
            return 0;
        }
        if (n == 1) return 1;
        int len = (n - 1) / 2;
        int res = 1;
        for (int i = 1; i <= len; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(cntOfTrees(7));
    }
}
