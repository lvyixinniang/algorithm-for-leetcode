package interface150;

import java.util.ArrayList;
import java.util.List;

public class lc25 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode reverseKGroup(ListNode head, int k) {
        int count = 0; // 计数器
        ListNode pre = new ListNode(-1, head);
        ListNode cur = pre;
        ListNode next = pre; // 存储翻转前的指针
        ListNode nextRes = pre;
        cur = cur.next;
        List<ListNode> res = new ArrayList<>();
        while (cur != null) {
            res.add(cur);
            cur = cur.next;
        }
        int i = 0;
        for (; i < res.size(); i++) {
            count ++;
            if (count == k) {
                // 说明 在 【i - k ，i） 需要翻转
                for (int j = i; j >= i - k + 1; j--) {
                    nextRes.next = res.get(j);
                    nextRes = nextRes.next;
                }
                count = 0;
            }
        }
        if (res.size() % k > 0) {
            int yushu = res.size() % k;
            int chushu = res.size() / k;
            i = chushu * k ;
            for (; i < res.size(); i++) {
                nextRes.next = res.get(i);
                nextRes = nextRes.next;
            }
        }
        nextRes.next = null;
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(reverseKGroup(head, 3));
    }
}
