package leetcode.LCR;



public class leetcode120 {
    public static void main(String[] args) {
        System.out.println(findRepeatDocument(new int[]{1, 1, 1}));
    }
    public static int findRepeatDocument(int[] documents) {
        // 查找重复数字 桶排
        int[] arr = new int[100000];
        for (int i : documents) {
            if (arr[i] == 0) arr[i] = 1;
            else return i;
        }
        return -1;
    }
}
