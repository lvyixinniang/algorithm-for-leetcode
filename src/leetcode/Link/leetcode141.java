package leetcode.Link;

public class leetcode141 {
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
      ListNode(int x, ListNode next) {
          val = x;
          this.next = next;
      }
  }
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
//        快慢 指针
        ListNode fast = head, law = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            law = law.next;
            if (fast == law) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3,
                new ListNode(2,
                        new ListNode(0,
                                new ListNode(-4))));
        hasCycle(head);
    }
}
