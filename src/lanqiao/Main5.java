package lanqiao;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        double p = sc.nextDouble();
//考的数学 概率论
        int min =n+1;
        for (int i = 5; i <= n; i++) {
            double sum =0;
            double x = 1.0*n/i;
            sum = Math.pow(x,x);
            for(int j =1;j*j<x;j++){
                sum = sum + j*i;
            }
            if(Math.floor(sum) <min){
                min = (int) Math.floor(sum);
            }

        }
        System.out.println(min);

    }
}
