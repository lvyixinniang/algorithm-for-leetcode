package link_tree_stracking.delete;

public class lc82 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode cur = new ListNode(-1, head);
        ListNode cur1 = cur;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                ListNode temp = cur.next;
                while (temp.next != null && temp.val == temp.next.val) {
                    temp = temp.next;
                }
                cur.next = temp.next;
            }else {
                cur = cur.next;
            }
        }
        return cur1.next;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(1,new ListNode(1, new ListNode(1,
//                new ListNode(2,new ListNode(3)))));
        ListNode head = new ListNode(1, new ListNode(1));
        System.out.println(deleteDuplicates(head));
    }
}
