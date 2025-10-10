package interface150II;

public class lc25 {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
//  todo 这也没做出来 2025/7/20(重做 8/31日重做(没做完）
    public ListNode reverseKGroup(ListNode head, int k) {
        return null;
    }

    public static void main(String[] args) {
        lc25 lc25 = new lc25();
        ListNode head = lc25.reverseKGroup(lc25.new ListNode(1, lc25.new ListNode(2, lc25.new ListNode(3, lc25.new ListNode(4)))), 3);
    }
}
