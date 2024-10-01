package leetcode.Link;

import java.util.*;

public  class leetcode25 {
      public static  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        List<List<ListNode>> lists = new ArrayList<>();
        int len = 0;
        while (head != null) {
            List<ListNode> list = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                if (head == null) break;
                list.add(head);
                head = head.next;
                len++;
            }
            lists.add(list);
        }

        int length = lists.size();
        ListNode head1 = new ListNode(-1), head2 = head1;
        for (int i = 0; i < length ; i++) {
            if (lists.get(0).size() == k)swap(lists.get(0));
            else break;
            List<ListNode> remove = lists.remove(0);
            for (int j = 0; j < remove.size(); j++) {
                head1.next = remove.get(j);
                head1 = head1.next;
            }
        }
        if (lists.size() != 0) {
            List<ListNode> remove = lists.remove(0);
            for (int j = 0; j < remove.size(); j++) {
                head1.next = remove.get(j);
                head1 = head1.next;
            }
        }
        head1.next = null;
        return head2.next;
    }
    public static List<ListNode> swap(List<ListNode> list) {
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        reverseKGroup(head,3);
    }
}
