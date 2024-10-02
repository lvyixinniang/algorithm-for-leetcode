package leetcode.Link;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class leetcode148 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        List<ListNode> list = new ArrayList<>();
        ListNode pA = head;
        while (pA != null) {
            list.add(pA);
            pA = pA.next;
        }
        list.sort((o1, o2) -> {
            return o1.val - o2.val;
        });
        ListNode head1 = new ListNode(1), head2 = head1;
        while (list.size() != 0) {
            head1.next = list.remove(0);
            head1 = head1.next;
        }
        head1.next = null;
        return head2.next;
    }
}
