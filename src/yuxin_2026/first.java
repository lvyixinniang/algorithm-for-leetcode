package yuxin_2026;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author hc
 * @date
 **/
public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();
            String t = sc.next();

            // only swap
            HashMap<Character, Integer> mapS = new HashMap<>();
            HashMap<Character, Integer> mapT = new HashMap<>();
            int lens = s.length(), lent = t.length();
            if (lens != lent) {
                System.out.println("No");
            } else {
                for (int i = 0; i < lens; i++) {
                    char cs = s.charAt(i);
                    char ct = t.charAt(i);
                    mapS.put(cs, mapS.getOrDefault(cs, 0) + 1);
                    mapT.put(ct, mapT.getOrDefault(ct, 0) + 1);
                }
            }
            Set<Character> characters = mapS.keySet();
            boolean flag = true;
            for (Character character : characters) {
                if (!mapT.containsKey(character)) {
                    System.out.println("No");
                    flag = false;
                    break;
                } else if (mapT.get(character) != mapS.get(character)) {
                    System.out.println("No");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes");
            }
        }
    }
}
