package Code_Capriccio.link;

public class leetcode24 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static  ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pa = new ListNode(-1, head);
        ListNode pb = new ListNode(-1, pa);

        while (pa.next != null && pa.next.next != null ) {
            ListNode first = pa.next; // 1
            pa.next = first.next;
            first.next = pa.next.next;
            pa.next.next = first; // 2
            pa = pa.next.next;
        }

        return pb.next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1 , new ListNode(2));
        swapPairs(head);
    }
}
