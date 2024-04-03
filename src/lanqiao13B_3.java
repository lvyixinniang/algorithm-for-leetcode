import java.util.Scanner;

public class lanqiao13B_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =new int[26];
        String str = sc.next();
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            int temp = s-'A';
            arr[temp]++;
            if(arr[temp]>max){
                max = arr[temp];
            }
        }

        for (int i = 0; i < 26; i++) {
            if(arr[i] == max){
                char s = (char) (i+'A');
                System.out.print(s);
            }
        }
    }
}
