package link_tree_stracking.delete;

import java.util.HashSet;
import java.util.Set;

public  class lc83 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3)))));
        ListNode head = new ListNode(1,new ListNode(1,new ListNode(1)));
        System.out.println(deleteDuplicates(head));
    }
}
