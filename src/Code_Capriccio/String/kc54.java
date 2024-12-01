package Code_Capriccio.String;

import java.util.Scanner;

public class kc54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        char[] chars = new char[]{'n','u','m','b','e','r'};
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c <= '9' && c >= '0') {
                sb.append(chars);
            }else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
