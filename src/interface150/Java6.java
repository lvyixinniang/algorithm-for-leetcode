package interface150;

import java.util.ArrayList;
import java.util.List;

public class Java6 {
  static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public void reorderList(ListNode head) {
      // 方法一： 使用了额外空间
/*        if (head == null) return;
        ListNode root = head;
        List<ListNode> nodes = new ArrayList<>();
        while (root != null) {
            nodes.add(root);
            root = root.next;
        }
        ListNode prev = new ListNode(-1);
        prev.next = head;
        int oddIndex = 0, evenIndex = nodes.size() - 1;
        for (int i = 0; i < nodes.size(); i++) {
            if (i % 2 == 0) {
                // 0 , 1 , 2, 3
                prev.next = nodes.get(oddIndex++);
            } else {
                prev.next = nodes.get(evenIndex--);
            }
            prev = prev.next;
        }
        prev.next = null;*/

        // 方法二 ： 使用原地算法
        if (head == null || head.next == null) return;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 翻转 后面 链表
        ListNode prev = null, next = null, curr = slow;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 合并链表
        ListNode first = head, second = prev;
        while (second.next != null) {
            ListNode temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }

    }

    public static void main(String[] args) {
        Java6 java6 = new Java6();
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        ListNode head4 = new ListNode(5);
        ListNode head5 = new ListNode(6);
        ListNode head6 = new ListNode(7);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        java6.reorderList(head);

    }
}
