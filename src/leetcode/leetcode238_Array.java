package leetcode;

public class leetcode238_Array {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
//      L 和 R 分别表示左右两侧的乘积表
        int[] L = new int[length];
        int[] R = new int[length];

        int[] answer = new int[length];
        L[0] =1;
        for (int i = 1; i < length; i++) {
            L[i] = nums[i-1]*L[i-1];
        }

        R[length-1]=1;
        for (int i = length-2;i>=0; i--) {
            R[i] = nums[i+1]*R[i+1];
        }

        for (int i =0;i<length;++i){
            answer[i]=L[i]*R[i];
        }


        return answer;
    }
}
