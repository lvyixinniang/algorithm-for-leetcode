package leetcode.LCR;

public class leetcode142 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(6))));
        System.out.println(trainningPlan(l1, l2));
    }
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static  ListNode trainningPlan(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode root = new ListNode(-1), p = root;
        while (l1 != null || l2 != null) {
            int l1val = l1 != null ? l1.val : Integer.MAX_VALUE, l2val = l2 != null ? l2.val : Integer.MAX_VALUE;
            if (l1 != null &&l1val <= l2val) {
                p.next = l1;
                p = p.next;
                l1 = l1.next;
            } else if(l2 != null && l1val > l2val) {
                p.next = l2;
                p = p.next;
                l2 = l2.next;
            }
        }
        p = null;
        return root.next;
    }
}
