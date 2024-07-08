package leetcodeExam405_single;

public class exam100339_String {
    public static void main(String[] args) {
        System.out.println(getEncryptedString("dart", 3));
    }
    public static String getEncryptedString(String s, int k) {
        int len = s.length();
        char[] str = s.toCharArray();
        char[] result = new char[len];
        for (int i = 0; i < len; i++) {
            result[i] = str[(i+k)%len];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(result[i]);
        }
        return sb.toString();
    }
}
