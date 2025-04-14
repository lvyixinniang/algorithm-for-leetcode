package interface150;

import java.util.Scanner;

public class tent1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }

    private static int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }
}
