package leetcode.Link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcode23 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeKLists(ListNode[] lists) {
//      排序数组的 方法
      int n = lists.length;
      if (n == 1) return lists[0];
      else if (n == 0) return null;
      int len = 0;
      List<ListNode> listNodes = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        ListNode head = lists[i];
        ListNode head1 = head;
        while (head1 != null) {
          listNodes.add(head1);
          len ++;
          head1 = head1.next;
        }
      }
      Collections.sort(listNodes,((o1, o2) -> {return o1.val - o2.val;}));
      ListNode head = new ListNode(1), head1 = head;
      for (int i = 0; i < len; i++) {
        head.next = listNodes.remove(0);
        head = head.next;
      }
      return head1.next;
    }
}
