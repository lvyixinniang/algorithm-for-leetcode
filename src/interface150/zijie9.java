package interface150;

public class zijie9 {

    public String solve (String s, String t) {
        // write code here
        // 先转换为 数组
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        StringBuilder sb = new StringBuilder();
        int jinwei = 0;
        int n = charArrayS.length, m = charArrayT.length;
        int min = Math.min(n, m);
        boolean s1 = n >= m? true : false;
        if (s1) {
            // s 字符串要长一些
            int index = 0;
            for (int i = min; i >= 0 ; i--) {
                int t_int = charArrayT[i];
                int s_int = charArrayS[m - 1- index];
                index ++;

                if (t_int + s_int >= 10) {
                    sb.append((t_int + s_int) % 10 + '0');
                    jinwei= 1;
                }
            }
        }
        return sb.reverse().toString();
    }
}
