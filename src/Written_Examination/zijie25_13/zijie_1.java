package Written_Examination.zijie25_13;

import java.util.Arrays;
import java.util.Scanner;

public class zijie_1 {
    static int res = 0;// 解法的种类
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] shuru = str.split("\\ ");
        int n = Integer.parseInt(shuru[0]);
        int s = Integer.parseInt(shuru[1]);
        int[] arr = new int[n];
        int index = 0;
        int sum = 0;
        str = sc.nextLine();
        String[] strings = str.split("\\ ");
        for (String string : strings) {
            arr[index] = Integer.parseInt(string);
            sum += arr[index ++];
        }
        int count = 0; // 当前总重量

        // 回溯法
        backTracking (arr, 0, count,  sum, s);

        System.out.println(res);
    }

    public static void  backTracking(int[] arr, int index , int count, int sum, int s) {
        if (count * 2 >= sum - s && count * 2 <= sum + s){
            res ++;
        } else if (count * 2 > sum + s) {
            return ;
        }
        for (int i = index; i < arr.length; i++) {
            count += arr[i];
            backTracking(arr, i + 1, count, sum, s);
            count -= arr[i];
        }
    }
}




/*// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}*/

/*
// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x = sc.nextInt();
                ans += x;
            }
        }
        System.out.println(ans);
    }
}*/
