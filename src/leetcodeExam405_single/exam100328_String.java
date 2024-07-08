package leetcodeExam405_single;

import java.util.ArrayList;
import java.util.List;

public class exam100328_String {
    public List<String> validStrings(int n) {
        if( n == 1){
            List<String> ll = new ArrayList<>();
            ll.add("0");
            ll.add("1");
            return ll;
        }
        List<String> result = new ArrayList<>();
        int maxx = 1;
        for (int i = 0; i <n ; i++) {
            maxx *=2;
        }
        for (int i = 0; i < maxx; i++) {
            String s = Integer.toBinaryString(i);
            s = String.format("%"+n+"s",s).replace(' ', '0');
            if(jugde(s)){
                result.add(s);
            }
        }
        return  result;
    }
    public static Boolean jugde(String s){
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            if (str[i] == '0' && str[i+1] == '0'){
                return false;
            }
        }
        return true;
    }
}
