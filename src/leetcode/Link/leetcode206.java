package leetcode.Link;

import java.util.ArrayList;
import java.util.List;

public class leetcode206 {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static  ListNode reverseList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode p = head;
        ListNode ass = new ListNode(0), pa =  new ListNode(1,ass);
        while (p != null) {
            list.add(p);
            p = p.next;
        }
        for (int i =  list.size() - 1; i >= 0; i--) {
            ass.next = list.get(i);
            ass = ass.next;
        }
        ass.next = null;
        return pa.next.next;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(1
                ,new ListNode(2
                ,new ListNode(3
                , new ListNode(4
                , new ListNode(5)))));
          reverseList(headA);
    }
}
