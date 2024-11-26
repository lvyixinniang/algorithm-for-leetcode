package Code_Capriccio.link;

public class lc203 {
  public static  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static  ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode pa = new ListNode(-1, head);
        ListNode pb = new ListNode(-1, pa);
        while (pa != null) {
            if (pa.next == null) break;
            if (pa.next.val == val) {
                // 当前Node 在中部、头部
                if (pa.next.next != null) {
                    pa.next = pa.next.next;
                }
                // 当前Node 在尾部
                else {
                    pa.next = null;
                    pa = pa.next;
                }
            }else pa = pa.next;

        }
        return pb.next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        removeElements(head, 2);
    }
}
