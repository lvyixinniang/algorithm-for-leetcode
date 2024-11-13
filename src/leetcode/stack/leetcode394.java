package leetcode.stack;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class leetcode394 {
//    TODO 感觉有些像 逆波兰表达式了
    public static String decodeString(String s) {

        int len = s.length();
        char[] charArray = s.toCharArray();
//        创建栈
        ArrayDeque<Character> queue = new ArrayDeque<Character>();
        for (int i = 0; i < len; i++) {
            if (charArray[i] == ']') {
                StringBuilder sb = new StringBuilder();
                StringBuilder shuzi = new StringBuilder();
                while (true) {
                    char c = queue.removeLast();
//                    数字还可能不只是 个位
                    if (c >= '0' && c <= '9') {
                        shuzi.append(c);
                        if (queue.isEmpty() || queue.getLast() == '[' || (queue.getLast() >= 'a' && queue.getLast() <='z')) break;
                    } else if (c == '['){
                        continue;
                    } else {
                        sb.append(c);
                    }
                }
                sb.reverse();
                shuzi.reverse();
                int count = 0;
                for (int j = 0; j < shuzi.length(); j++) {
                    if (j > 0) count *= 10;
                    count = count + (shuzi.charAt(j) - '0');
                }
                //  再重新压入 栈中
                for (int j = 0; j < count; j++) {
                    for (int k = 0; k < sb.length(); k++) {
                        queue.offer(sb.charAt(k));
                    }
                }
            } else {
                queue.offer(charArray[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("x12[a]"));
    }
}
