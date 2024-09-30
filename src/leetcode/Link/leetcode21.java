package leetcode.Link;

public class leetcode21 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null? list2 : list1;
        }

        ListNode p1 = list1, p2 = list2, p3 = new ListNode(1),p4 = p3;
        while (p1 != null || p2 != null) {
            if (p1.val >= p2.val) {
                p3.next = p2;
                if (p2 != null) p2 = p2.next;
            }else if (p1.val < p2.val) {
                p3.next = p1;
                if (p1 != null) p1 = p1.next;
            }
            p3 = p3.next;
        }

        return p4.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));
        ListNode list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));
        mergeTwoLists(list1,list2);
    }
}
