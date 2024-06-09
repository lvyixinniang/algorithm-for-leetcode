package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode189_Array {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        System.out.println(nums);
    }
   /* public static void rotate(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int len  = nums.length;
        int account = k;
//        使用减法会有越界问题
        for (int i = 0; i < len; i++) {
            if(i<k){
                list.add(nums[(len-account--)%(len+1)]);
            }else{
                list.add(nums[(i-k)%(len+1)]);
            }
        }
        for (int i = 0; i < len; i++) {
            nums[i] = list.get(i);
        }

    }*/
   public static void rotate(int[] nums, int k) {
       int n = nums.length;
       // 使用 list 集合 ,会有一个问题 , list的下标,也就是总量会随着list的长度增加 , 开始时, 下标不会有那么长
       int[] arr = new int[n];
       for (int i = 0; i < nums.length; i++) {
           arr[(i+k)%n] = nums[i];
       }
       System.arraycopy(arr,0,nums,0,n);


   }

}
