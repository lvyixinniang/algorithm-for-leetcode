package LC_WeeklyMatch;

public class lc438Q1 {
    public static boolean hasSameDigits(String s) {
        String str = service(s);
        while (str.length() != 2) {
            str = service(str);
        }
        return str.charAt(0) == str.charAt(1);
    }

    private static String service(String str) {
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len - 1; i++) {
            int val1 = Integer.parseInt(str.substring(i, i + 1));
            int val2 = Integer.parseInt(str.substring(i + 1, i + 2));
            sb.append( (val1 + val2) % 10 );
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(hasSameDigits("3902"));
    }
}
