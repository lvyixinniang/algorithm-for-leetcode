import java.util.Scanner;

public class tuan2025Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // biaoshi zushu
        while (T-- > 0) {
            int p = 0;
            String s = sc.next();
            char[] charArray = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = charArray[i];
                if (c >= '0' && c <= '9') {
                    // 他为数字
                    if (p == 0) {
                        p = c - '0';
                    }else {
                        p = p * 10 + c - '0';
                    }
                } else {
                    // 他不是数字
                    // 需要先将字符串左移 P 位
                    if (p != 0){
                        int len = sb.length();
                        p = p % len;
                        StringBuilder sb1 = new StringBuilder();
                        char[] charArray1 = sb.toString().toCharArray();
                        for (int j = p; j < len; j++) {
                            sb1.append(charArray1[j]);
                        }
                        for (int j = 0; j < p; j++) {
                            sb1.append(charArray1[j]);
                        }
                        sb.delete(0, sb.length());
                        sb.append(sb1.toString());
                        p = 0;
                    }
                    if (c == 'R') {
                        // 翻转字符串
                        sb.reverse();
                    } else {
                        sb.append(c);
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }

}
