package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class leetcode234_Link {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        List<Integer> vals = new ArrayList<>();

//        将链表的值复制到数组中
        ListNode currnetNode = head;
        while(currnetNode != null){
            vals.add(currnetNode.val);
            currnetNode = currnetNode.next;
        }

//        使用双指针判断是否为回文
        int front = 0;
        int back = vals.size()-1;
        while (front < back) {
            if (!vals.get(front).equals(vals.get(back))){
                return false;
            }
            front++;
            back--;
        }
        return true;

    }
}
