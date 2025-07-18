package interface150II;

public class lc21 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode re = new ListNode(0);
        ListNode ans = new ListNode(-1,re);
        while (list1 != null || list2 != null) {
            int x1 = list1 == null ? 101 : list1.val;
            int x2 = list2 == null ? 101 : list2.val;
            if (list1 !=null && list2 != null) {
                if (x1 < x2) {
                    re.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    re.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
                re = re.next;
            } else {
                re.next = new ListNode(list1 == null ? list2.val : list1.val);
                re = re.next;
                if (list1 != null) list1 = list1.next;
                if (list2 != null) list2 = list2.next;
            }
        }
        return ans.next.next;
    }

    public static void main(String[] args) {
        lc21 solution = new lc21();
        ListNode list1 = new ListNode(6);
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        lc21.mergeTwoLists(list1, list2);
    }
}
