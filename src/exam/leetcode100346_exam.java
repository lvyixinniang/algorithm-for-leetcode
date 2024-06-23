package exam;

// 最后30分钟 ， 才进竞赛 ， 最后5分钟 ， 做的这道题  ，此题没做完

public class leetcode100346_exam {
    public static void main(String[] args) {
        int[] nums =new int[]{0,1,1,0,1};
         System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int ji=-1;
        int accont =0;
        int sum=0;
        for (int i = 0; i < nums.length; i++,i=0) {
            if(ji == -1){
                if(nums[i] == 1){
                    ji = 1;
                    nums = reverseNums(nums, i);
                    accont++;
                }
            }
            else{
                if (nums[i] == 0){
                    ji =-1;
                    nums = reverseNums(nums, i);
                    accont++;
                }
            }
            for (int i1 = 0; i1 < nums.length; i1++) {
                if( nums[i] ==1){
                    sum++;
                }
            }
            if(sum == nums.length){
                return accont;
            }
        }

        return accont;
    }
    public static int[] reverseNums(int[] nums,int start){

        for (int i = start;i< nums.length;i++){
            nums[i] = nums[i]==0?1:0;
        }

        return nums;
    }
}
