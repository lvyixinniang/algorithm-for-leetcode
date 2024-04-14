import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

      List<List> fulist =new ArrayList<>();
      for(int i =0;i<n;i++){
          List<Integer> zilist =new ArrayList<>();
          fulist.add(zilist);
      }
        for (int i = 0; i <= 4000; i++) {
            String s = sc.next();
            if(s.contains("add")){
                int x =sc.nextInt();

                fulist.get(0).add(1);
            } else if (s.contains("sync")) {
                int x = sc.nextInt();

                fulist.get(x).add(1);
            } else if (s.contains("query")) {
                int min =99999;
                for (int i1 = 1; i1 < n; i1++) {
                    if(fulist.get(i1).size()<min){
                        min = fulist.get(i1).size();
                    }
                }
                System.out.println(min);
            }else if(s == null){
                break;
            }
        }

    }
}