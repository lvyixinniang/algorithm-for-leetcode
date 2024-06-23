package exam;

public class leetcode100345_exam {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(minimumOperations(nums));
    }
    public static int minimumOperations(int[] nums) {
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%3 == 1){
                sum+=1;
            }else if(nums[i]%3==2){
                sum+=1;
            }
        }

        return sum;
    }
}
