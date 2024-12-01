package Code_Capriccio.String;

public class lc28 {
    public static void main(String[] args) {
        System.out.println(strStr("a", "a"));
    }
    public static int strStr(String haystack, String needle) {
        char[] haystackCharArray = haystack.toCharArray();
        char[] needleCharArray = needle.toCharArray();
        for (int i = 0; i < haystackCharArray.length; i++) {
            int flag = 1;
            if (haystackCharArray[i] == needleCharArray[0]) {
                int count = i;
                for (int j = 0; j < needle.length(); j++) {
                    if (count == haystackCharArray.length) {
                        flag = 0;
                        break;
                    }
                    if (haystackCharArray[count] != needleCharArray[j]) {
                        flag = 0;
                        break;
                    }
                    count ++;
                }
                if (flag == 1) return i;
            }
        }

        return -1;
    }
}
