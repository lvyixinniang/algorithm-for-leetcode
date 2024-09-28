package leetcode.Link;

import java.util.*;

public class leetcode234 {
      public static  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static boolean isPalindrome(ListNode head) {
        ListNode pA = head;
        String s1 = "";
        while (pA != null) {
            s1 += pA.val;
            pA = pA.next;
        }
//        双指针
        int l = 0, r = s1.length() - 1;
        for (l = 0; l < s1.length() && l <= r; l++) {
            r = s1.length() - 1 - l;
            char cl = s1.charAt(l), cr = s1.charAt(r);
            if (cl != cr) return false;
        }
        return true;
    }

    public static void main(String[] args) {
          ListNode head = new ListNode(1
          ,new ListNode(2
          ,new ListNode(3
          ,new ListNode(2
          ,new ListNode(1)))));
          isPalindrome(head);
    }
}
