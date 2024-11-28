package Code_Capriccio.HashTable;

public class lc202 {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {
        int[] board = new int[]{0, 1, 4, 9, 16, 25, 36, 49, 64, 81};
        while (n != -1) {
            int sum = 0;
            while (n != 0) {
                sum += board[n % 10 ];
                n /= 10;
            }
            if (sum == 4) return false;
            else if (sum == 1) {
                break;
            } else {
                n = sum;
            }
        }
        return true;
    }
}
