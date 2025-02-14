package link_tree_stracking.delete;

public class lc237 {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void deleteNode(ListNode node) {
        ListNode pre = node.next;
        node.val = pre.val;
        // 删除 pre节点
        ListNode last = pre.next;
        node.next = last;
    }

    public static void main(String[] args) {

    }
}
