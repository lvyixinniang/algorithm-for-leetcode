package leetcode.LCR;

public class leetcode132 {
    public static void main(String[] args) {
        System.out.println(cuttingBamboo(10));
    }
    public static int cuttingBamboo(int bamboo_len) {
        if (bamboo_len <= 3) {
            return bamboo_len - 1;
        }
//        最优： 3 。把竹子尽可能切为多个长度为 3 的片段，留下的最后一段竹子的长度可能为 0,1,2 三种情况。
//        次优： 2 。若最后一段竹子长度为 2 ；则保留，不再拆为 1+1 。
//        最差： 1 。若最后一段竹子长度为 1 ；则应把一份 3+1 替换为 2+2，因为 2×2>3×1。
        int option = bamboo_len % 3;
        int thirdCount = bamboo_len / 3;
        long res = 1;
        if (option == 0) {
            for (int i = 0; i < thirdCount; i++) {
                res *= 3;
                res %= 1000000007;
            }
        }else if (option == 2) {
            for (int i = 0; i < thirdCount; i++) {
                res *= 3;
                res %= 1000000007;
            }
            res *= 2;
            res %= 1000000007;
        }else if (option == 1) {
            for (int i = 0; i < thirdCount - 1; i++) {
                res *= 3;
                res %= 1000000007;
            }
            res *= 4;
            res %= 1000000007;
        }
        return (int) res;
    }
}
