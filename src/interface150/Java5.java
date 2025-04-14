package interface150;

import java.util.ArrayList;
import java.util.List;

// 字典树

public class Java5 {
    class Ring{
        class Node {
            int val;
            Node next;
            public Node(int val) {
                this.val = val;
            }
            public Node(int val, Node next) {
                this.val = val;
                this.next = next;
            }
        }

        public Node head = null;
        public Node tail = null;
        public Node curr = null;

        // add
//        public void add(int val) {
//            if (head == null)
//        }
    }
    public int ysf (int n, int m) {
        // write code here
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int count = 0;
        while (list.size() > 1) {
            int x = m % list.size();
            count = (count + x - 1 + list.size()) % list.size() ;
            list.remove(count);
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        Java5 java5 = new Java5();
        System.out.println(java5.ysf(5, 2));
    }
}
