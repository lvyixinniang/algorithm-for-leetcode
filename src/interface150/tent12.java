package interface150;

public class tent12 {

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
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                // 后续可能不止两个
                ListNode tempPrev = temp;
                ListNode tempNext = temp.next.next != null ? temp.next.next : null;
                while (tempNext!= null && tempNext.val == tempPrev.val) {
                    tempNext = tempNext.next;
                }
                // 找到前后两个值， 进行链接
                tempPrev.next = tempNext;
            }
            temp = temp.next;
        }
        if (head != null) {
            return head;
        }else {
            head.next = null;
            return head;
        }
    }
    public static void main(String[] args) {
          tent12 t = new tent12();
          ListNode head = new ListNode(1);
          ListNode head1 = new ListNode(1);
          ListNode head2 = new ListNode(1);
          head.next = head1;
          head1.next = head2;
        System.out.println(t.deleteDuplicates(head));
    }
}
