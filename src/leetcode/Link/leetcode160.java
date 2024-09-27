package leetcode.Link;

public class leetcode160 {
      public static  class ListNode {
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
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
//        最终都会到 null
        while (pA != pB) {
            if (pA == pB) return pA;
            pA = pA != null? pA.next : headB;
            pB = pB != null? pB.next : headA;
         }
        return pA;
    }

    public static void main(String[] args) {
        ListNode heradA = new ListNode(4,new ListNode(1
                ,new ListNode(8
                , new ListNode(4
                , new ListNode(5)))));
        ListNode headB = new ListNode(2,
                new ListNode(6
                , new ListNode(4)));

        getIntersectionNode(heradA,headB);
      }
}
