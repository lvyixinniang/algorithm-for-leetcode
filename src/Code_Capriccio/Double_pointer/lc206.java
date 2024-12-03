package Code_Capriccio.Double_pointer;

import java.util.ArrayList;
import java.util.List;

public class lc206 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    /**
     * 使用了 额外的数组
     * @param args
     */
/*    public static  ListNode reverseList(ListNode head) {
      if (head == null || head.next == null) return head;
      ListNode pa = new ListNode(-1);
      ListNode pb = new ListNode(-1, pa);
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            pa.next = list.get(i);
            pa = pa.next;
        }
        pa.next = null;
        return pb.next.next;
    }*/

    /**
     * 空间复杂度 为 O（1）
     * @param head
     */
    private static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reverseList(head);
    }


}
