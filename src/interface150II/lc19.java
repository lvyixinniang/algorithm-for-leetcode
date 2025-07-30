package interface150II;

public class lc19 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        if (n == size) return head.next;

        curr = head;
        ListNode prev = null;
        ListNode next = null;
        for (int i = 0; i < size - n - 1; i++) {
            curr = curr.next;
        }
        prev = curr != null ? curr : null;
        next = curr.next != null ?curr.next.next : null;
        prev.next = next;
        return head;
    }

    public static void main(String[] args) {
        lc19 lc19 = new lc19();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4 , new ListNode(5)))));
        lc19.removeNthFromEnd(head, 2);
    }
}
