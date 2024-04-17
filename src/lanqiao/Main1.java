package lanqiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int max =0;
        for(int i = 90;i<100;i++){
            List<Long> list1 =new ArrayList<>();
            List<Long> list2 =new ArrayList<>();
            long temp = i;
            while(temp>0) {
                list1.add(temp%10);
                temp/=10;
            }

            for(int j =list1.size()-1 ; j>=0;j--) {
//			交换次序
                long o = list1.get(j);
                list2.add(o);
            }
            int len = list2.size();
            for(int j = list2.size(); list2.get(list2.size()-1)<i;i++){
                long y =0l;
                j = list2.size();
                for(int k =1 ; k<=len;k++) {
                    long sk = list2.get(j-k);
                    y+=sk;
                }
                list2.add(y);
                if(list2.contains(i)){
                    if(max<i){
                        max =i;
                    }
                    break;
                }
            }

        }
        System.out.println(max);
    }

}
