package leetcode.LCR;

public class leetcode123 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3, new ListNode(6, new ListNode(4, new ListNode(1))));
        reverseBookList(head);
    }
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static int[] reverseBookList(ListNode head) {
        ListNode pa = head;
        int len = 0;
        while (pa != null) {
            len ++;
            pa = pa.next;
        }
        int[] arr = new int[len];
        pa = head;
        while (pa != null) {
            if (len != 0)
            arr[-- len] = pa.val;
            pa = pa.next;
        }

        return arr;
    }
}
