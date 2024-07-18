package leetcode406_single;

public class leetcode100352 {
    public static void main(String[] args) {
        String s ="45320";
        System.out.println(getSmallestString(s));
    }
    public static String getSmallestString(String s) {
        char[] chars = s.toCharArray();
        int len = s.length();
        for (int i = 0; i < len -1; i++) {
            int qian = Integer.parseInt(s.substring(i,i+1));
            int hou = Integer.parseInt(s.substring(i+1,i+2));
            if((qian+hou)%2 == 0 && qian>hou){
                char ch = chars[i];
                chars[i] = chars[i+1];
                chars[i+1] = ch;
                break;
            }
        }
        String string = new String(chars);
        return string;
    }
}
