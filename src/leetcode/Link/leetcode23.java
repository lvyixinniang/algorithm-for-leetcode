package leetcode.Link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcode23 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode mergeKLists(ListNode[] lists) {
/*//      排序数组的 方法
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
      return head1.next;*/
//  这个速率也是比数组的方式慢很多

      int n = lists.length;
      if (n == 1) return lists[0];
      else if (n == 0) return null;
      ListNode head = lists[0];
      for (int i = 1; i < n; i++) {
        head = mergeTwiceListNode(head, lists[i]);
      }
      return head;
    }

    public static ListNode mergeTwiceListNode(ListNode l1, ListNode l2) {
      if (l1 == null || l2 == null) {
        return l1 == null ? l2 : l1;
      }
      ListNode head = new ListNode(1), head1 = head;
      while (l1 != null && l2 != null) {
        if (l1.val >= l2.val) {
          head.next = l2;
          head = head.next;
          l2 = l2.next;
        }else{
          head.next = l1;
          head = head.next;
          l1 = l1.next;
        }
      }
      if (l1 != null || l2 != null) {
        head.next = l1 ==null ? l2 : l1;
      }
      return head1.next;
    }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1,
            new ListNode(4,
                    new ListNode(5)));
    ListNode l2 = new ListNode(1,
            new ListNode(3,
                    new ListNode(4)));
    ListNode l3 = new ListNode(2,
            new ListNode(6));
    ListNode[] lists = new ListNode[]{l1,l2,l3};
    mergeKLists(lists);
  }
}
