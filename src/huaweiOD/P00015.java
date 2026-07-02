package huaweiOD;

import java.util.*;

/**
 * @author hc
 * @date
 **/
public class P00015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        List<String> list = new ArrayList<>();
        String s = sc.nextLine();
        String[] str = s.split(",");
        for (String string : str) {
            list.add(string);
        }
//        Arrays.sort(str, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return (o1+o2).compareTo(o2+o1);
//            }
//        });
        Arrays.sort(str, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuilder sb = new StringBuilder();
        int count = Math.min(3, str.length);
        for (int i = 0; i < count; i++) {
            sb.append(str[i]);
        }
        // 全排列
        System.out.println(sb.toString());
    }
}
