package leetcode.LCR;

public class LCR177 {
    public static void main(String[] args) {
        System.out.println(sockCollocation(new int[]{4, 5, 2, 4, 6, 6}));
    }
    public static int[] sockCollocation(int[] sockets) {
        int x = 0 , y = 0,  m = 1, n = 0;
        for (int i : sockets) {
            n ^= i;
        }
        while ((n & m) == 0) {
            m <<= 1;
        }
        for (int i : sockets) {
            if ((i & m) != 0) x ^= i;
            else y ^= i;
        }
        return new int[] {x, y};
    }
}
