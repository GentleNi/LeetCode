package com.leetcode.linkedlist;

/**
 * @Author GentleNi
 * @Date 2018-12-10 20:28
 **/

public class Demo141_LinkedList_Cycle {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        // 设置两个指针，一个快一个慢
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
