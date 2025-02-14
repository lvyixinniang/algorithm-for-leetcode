package link_tree_stracking.xunhuan;

import java.util.ArrayList;
import java.util.List;

public class lc1290 {

          public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
              ListNode(int val) { this.val = val; }
              ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        public static int getDecimalValue(ListNode head) {
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            int sum = 0, count = 1;
            for (int i = 0; i < list.size(); i++) {
                sum += count * list.get(i);
                count *= 2;
            }
            return sum;
        }

        public static void main(String[] args) {
//              [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
            ListNode head = new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,new ListNode(0,
                    new ListNode(0, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(0, new ListNode(0, new ListNode(1
                            , new ListNode(0, new ListNode(0, new ListNode(1)))))))))))))));
            System.out.println(getDecimalValue(head));
        }

}
