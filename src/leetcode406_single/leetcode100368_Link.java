package leetcode406_single;


import java.util.ArrayList;

import java.util.List;

public class leetcode100368_Link {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        System.out.println(modifiedList(new int[]{1, 2, 3}, head));
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode modifiedList(int[] nums, ListNode head) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        ListNode pa = new ListNode();
        ListNode pb = new ListNode();
        pa.next = head;
        pb =pa;
        while(pa.next!=null){
            if (list.contains(pa.val)){
                pa.next = pa.next.next;
            }
            pa = pa.next;
        }
        return pb.next;
    }
}
