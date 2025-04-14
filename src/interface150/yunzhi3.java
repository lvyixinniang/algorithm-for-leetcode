package interface150;

import java.util.*;

public class yunzhi3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = 1;
        // stack
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0 && charArray[0] == '+') {
                System.out.println(0);
                return;
            } else if (i < charArray.length - 1 && charArray[i] == '-' &&
                    (charArray[i + 1] == '-' || charArray[i + 1] == '+')) {
                System.out.println(i);
                return;
            } else if (i < charArray.length - 1 && charArray[i] == '+' &&
                    (charArray[i + 1] == '-' || charArray[i + 1] == '+')) {
                System.out.println(i);
                return;
            } else if (i == 0 && charArray[0] == '0' && (charArray[i+1] != '+' && charArray[i+1] != '-')) {
                System.out.println(1);
                return;
            } else if (i == charArray.length - 1 && (charArray[i] == '+' ||
                    charArray[i] == '-')) {
                System.out.println(i);
                return;
            } else if (i < charArray.length - 2 && (charArray[i] == '+' ||
                    charArray[i] == '-') && charArray[i + 1] == '0' && (charArray[i + 2] != '+' &&
                    charArray[i + 2] != '-')) {
                // 123 + 012
                //8-0++
                // 923+83-23
                System.out.println(i + 2);
                return;
            }
            n = i + 1;
        }
        System.out.println(n);
    }
}
