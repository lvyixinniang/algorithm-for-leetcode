package leetcode.Link;

import java.util.ArrayList;
import java.util.List;

public  class leetcode24 {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode swapPairs(ListNode head) {
          if (head == null || head.next == null) return head;

        int signal = 0;
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            ListNode temp = head;
            list.add(temp);
            head = head.next;
        }
        ListNode curr = list.get(1), prev = list.get(0);
        ListNode head1 = new ListNode(-1), head2 = head1;
        int size = list.size();
        for (int j = 0; j < size / 2; j ++) {
            prev = list.remove(0);
            curr = list.remove(0);
            head1.next = curr;
            head1.next.next = prev;
            head1 = head1.next.next;
        }
        if (list.size() != 0) {
            head1.next = list.remove(0);
            head1 = head1.next;
        }

        head1.next = null;
        return head2.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4))));
        swapPairs(head);
    }
}
