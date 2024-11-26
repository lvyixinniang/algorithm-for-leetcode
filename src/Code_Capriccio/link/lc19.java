package Code_Capriccio.link;

public class lc19 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static  ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        if (head.next == null) {
            return null;
        }
        ListNode p = head;
        while (p != null) {
            size ++;
            p = p.next;
        }
        int count = 0;
        ListNode pa = new ListNode(-1, head);
        ListNode pb = new ListNode(-1, pa);
        while (true) {
            if (count != size - n) {
                pa = pa.next;
                count ++;
                continue;
            }
            if (count == size) {
                pa.next = null;
            } else {
                pa.next = pa.next.next;
            }
            break;
        }

        return pb.next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        removeNthFromEnd(head, 5);
    }
}
