import java.lang.module.FindException;
import java.util.Scanner;

public class csp2023_03_2 {
    public static void main(String[] args){
        long n,m,k;
        // 三个正整数 n。m和 k.分别表示待开垦的区域总数、顿顿手上的资源数量和每块区域的最少开垦天数。


        Scanner sc =new Scanner(System.in);
        n = sc.nextLong();
        m = sc.nextLong();
        k = sc.nextLong();
//两个正整数 和 ，分别表示第 块区域开垦耗时和将耗时缩短 天所需资源数量。
        int[][] arr = new int[(int)n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
// 思路是1-》每次得到时间所需的最大值， 2-》 与资源数做比较看是否能支付 and 和K做比较，若最大值满足等于k
// 即结束，循环此操作
        int index = sunZaoMax(arr);
        while(m>=0&&arr[index][0]>k){
            //天数-1，资源-arr[index][1]
            if(m-arr[index][1]>=0){
                m-=arr[index][1];
                arr[index][0]--;
//                System.out.println("11111111111");
            }else{
                break;
            }
            index = sunZaoMax(arr);
        }
        System.out.println(arr[index][0]);
    }

    public static int sunZaoMax(int[][] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[max][0]<arr[i][0]){
                max=i;
            }
        }
//        System.out.println("max"+max+"    arr[max][0]"+arr[max][0]);
        return max;
    }
}
