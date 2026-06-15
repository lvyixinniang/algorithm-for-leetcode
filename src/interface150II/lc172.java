package interface150II;

public class lc172 {

// todo 存在问题
    public int trailingZeroes(int n) {
        // 由 2 和 5 的数量决定
        int curr = n;
        int count5 = 0;

        for (int i = 5; i <= curr; i += 5) {
            int temp = i;
            while (temp % 5 == 0) {
                count5++;
                temp /= 5;
            }
        }

        return count5;
    }

    public static void main(String[] args) {
        lc172 lc172 = new lc172();
        System.out.println(lc172.trailingZeroes(30));
    }

}
