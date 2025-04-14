package interface150;

import java.util.ArrayList;
import java.util.List;

public class zijie10 {
  static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public void reorderList(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            nodes.add(cur);
            cur = cur.next;
        }
        int size = nodes.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 1) {
                head = nodes.get(size - 1 - i);
            }else {
                head = nodes.get(i);
            }
            head = head.next;
        }
        head.next = null;
    }

    public static void main(String[] args) {
        zijie10 z = new zijie10();
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        z.reorderList(head);
    }
}
