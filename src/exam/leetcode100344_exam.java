package exam;

public class leetcode100344_exam {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,1,1,0,0};
        System.out.println(minOperations(nums));
    }
    public static  int minOperations(int[] nums) {
        int[] sum = new int[2];
        int accont =0 ;
        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] ==1) {
//                sum[1]++;
//            }else{
//                sum[0]++;
//            }
            if (nums[i] == 0){
                nums = reverseNums(nums, i);
                accont ++;
                if(nums == null ){
                    return -1;
                }
            }
        }

        return accont;
    }

    public static int[] reverseNums(int[] nums,int start){
        if (start +2 >= nums.length){
            return null;
        }

        for (int i = start;i<start+3;i++){
            nums[i] = nums[i]==0?1:0;
        }

        return nums;
    }
}
