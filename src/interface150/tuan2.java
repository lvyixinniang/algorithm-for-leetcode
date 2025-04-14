package interface150;

import java.util.*;

public class tuan2 {
  public static class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
      this.val = val;
    }
  }
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if (head == null || head.next == null) return head;
        Map<Integer,ListNode> map = new HashMap<>();
        List<ListNode> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            if (!map.containsKey(cur.val)) {
                list.add(cur);
            }
            map.put(cur.val, cur);
            cur = cur.next;
        }
        ListNode res1 = new ListNode(-1);
        ListNode res2 = res1;
        for (ListNode listNode : list) {
            res1.next = listNode;
            res1 = res1.next;
        }
        res1.next = null;
        return res2.next;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        list.next = list1;
        list1.next = list2;
        list2.next = list3;
        tuan2 t = new tuan2();
        System.out.println(t.deleteDuplicates(list));
    }
}
