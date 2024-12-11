package leetcode.LCR;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Scanner;

public class LCR184 {

    static class Checkout {
        // 队列
        LinkedList<Integer> queue;
        //  队列最大值 （维持一个 降序链表）
        LinkedList<Integer> descLink = new LinkedList<>();

        // 队列初始化
        public Checkout() {
            queue = new LinkedList<>();
        }

        // 获取队列的 最高价格
        public int get_max() {
            if (descLink.isEmpty()) {
                return -1;
            } else {
                return descLink.getFirst();
            }
        }

        // 将value 插入队列尾部
        public void add(int value) {
            queue.addLast(value);
            // 找到插入的位置
            if (!descLink.isEmpty()){
                boolean flag = true;
                for (int i = 0; i < descLink.size(); i++) {
                    if (value >= descLink.get(i)) {
                        descLink.add(i, value);
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    descLink.addLast(value);
                }
            }else {
                descLink.add(value);
            }
        }

        // 移除 队列首部元素
        public int remove() {
            if (!queue.isEmpty()) {
                Integer first = queue.removeFirst();
                // 找到删除的位置
                for (int i = 0; i < descLink.size(); i++) {
                    if (first.equals(descLink.get(i))) {
                        descLink.remove(i);
                        break;
                    }
                }
                return first;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.add(646);
        checkout.add(646);
        checkout.add(646);
        checkout.remove();
        checkout.add(871);
        checkout.remove();
        checkout.add(871);
        checkout.add(2);
        checkout.add(1);
        checkout.remove();
    }
}
