package lanqiao;

import java.util.Scanner;

public class lanqiao13B_2 {
    public static void main(String[] args) {
        int sum =0;
        for (Long i = 2022l; i <= 2022222022; i++) {
            sum+=function(i);
        }
//        3138
        System.out.println(sum);
    }
    public static int function(Long i ){
        //    使用翻转来确定是否为回文数
        Long data = i;
        String str = data.toString();
        boolean flag = true;
        int max = (int) str.charAt(0);
        for (int j = 1; j <= (str.length()-1)/2; j++) {
            int x = (int) str.charAt(j);
            if(x<max){
                flag = false;
            }
            max = x;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString())&&flag){
//            System.out.println(str);
            return 1;
        }else{
            return 0;
        }
    }
}
