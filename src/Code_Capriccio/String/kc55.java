package Code_Capriccio.String;

import java.util.Scanner;

public class kc55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.valueOf(sc.nextLine());
        String s = sc.nextLine();
        int len = s.length();
        String res = "";
        for (int i = len - k; i < len; i++) {
            res += s.charAt(i);
        }
        res += s.substring(0, len - k);

        System.out.println(res);
    }
}
