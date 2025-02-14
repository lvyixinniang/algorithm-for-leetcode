package link_tree_stracking.insert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc029 {
    static class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    };
    public static Node insert(Node head, int insertVal) {
        Node newNode = new Node(insertVal);
        // 空链表处理
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            return newNode;
        }
        Node prev = head;
        Node curr = head.next;
        boolean toInsert = false;

        do {
            // 情况1 插入值在prev 和 curr 之间
            if (prev.val <= insertVal && curr.val >= insertVal) {
                toInsert = true;
            }
            // 情况2 插入值在链表拐点 （prev > curr)
            else if (prev.val > curr.val) {
                // 插入值比 最大值大 或 最小值小
                if (insertVal >= prev.val || insertVal <= curr.val) {
                    toInsert = true;
                }
            }

            if (toInsert) {
                prev.next = newNode;
                newNode.next = curr;
                return head;
            }

            // 行进
            prev = curr;
            curr = curr.next;
        } while (prev != head);
        // 处理全链表相同的情况
        prev.next = newNode;
        newNode.next = curr;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(3, new Node(3,new Node(3)));
        head.next.next.next = head;
//        Node head = new Node(1);
//        head.next = head;
        System.out.println(insert(head, 4));
    }
}
