package Code_Capriccio.Double_pointer;

public class interface0207 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return headA == null ? headA : headB;
      ListNode pa = headA;
        ListNode pb = headB;
        boolean flagA = true, flagB = true;

        while (pa != null || pb != null) {
            if (pa == pb) return pa;
            pa = pa.next;
            pb = pb.next;
            if (flagA && pa == null) {
                flagA = false;
                pa = headB;
            }
            if (flagB && pb == null) {
                flagB = false;
                pb = headA;
            }
        }

        return null;
    }

//    public static void main(String[] args) {
//        ListNode head1 = new ListNode(4);
//        ListNode head2 = new ListNode(1);
//        ListNode head3 = new ListNode(5);
//        ListNode head4 = new ListNode(0);
//        ListNode head5 = new ListNode(1);
//        ListNode head6 = new ListNode(8);
//        ListNode head7 = new ListNode(4);
//        ListNode head8 = new ListNode(5);
//        head1.next = head2;
//        head2.next = head6;
//        head6.next = head7;
//        head7.next = head8;
//        head3.next = head4;
//        head4.next = head5;
//        head5.next = head6;
//        System.out.println(getIntersectionNode(head1, head3));
//    }
//    public static void main(String[] args) {
//        ListNode head1 = new ListNode(3);
//        ListNode head2 = new ListNode(2);
//        head2.next = head1;
//        System.out.println(getIntersectionNode(head1, head2));
//    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(9);
        ListNode head3 = new ListNode(1);
        ListNode head4 = new ListNode(3);
        ListNode head5 = new ListNode(2);
        ListNode head6 = new ListNode(4);
        head1.next =head2;
        head2.next = head3;
        head3.next = head5;
        head5.next = head6;
        head4.next = head5;
        System.out.println(getIntersectionNode(head1, head4));
    }
}
