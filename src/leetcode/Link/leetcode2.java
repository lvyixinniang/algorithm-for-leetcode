package leetcode.Link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcode2 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode prev = head;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }

        int lable = 0;
        while (list1.size() != 0 || list2.size() != 0) {
            Integer x = list1.size() == 0? 0 : list1.remove(0);
            Integer y = list2.size() == 0? 0 : list2.remove(0);
            int temp = x + y + lable;
            if (lable == 1) lable = 0;
            if (temp >= 10) {
                lable = 1;
                temp %= 10;
            }
            list3.add(temp);
        }
        if (lable == 1) list3.add(1);

        while (list3.size() != 0) {
            Integer remove = list3.remove(0);
            ListNode last = new ListNode(remove);
            head.next = last;
            head = head.next;
        }
        return prev.next;
    }

    public static void main(String[] args) {
        ListNode link1 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9)))))));
        ListNode link2 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9))));
        addTwoNumbers(link1,link2);
    }
}
