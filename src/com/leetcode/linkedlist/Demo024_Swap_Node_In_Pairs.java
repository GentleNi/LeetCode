package com.leetcode.linkedlist;

/**
 * Created by GentleNi
 * Date 2018/12/5.
 */
public class Demo024_Swap_Node_In_Pairs {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        ListNodeUtil.iterateList(node1);

        ListNode newHead = swapPairs(node1);

        ListNodeUtil.iterateList(newHead);
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        for (ListNode pre = dummy, curr = dummy.next, next = curr.next;
             next != null;
             pre = curr,curr = curr.next,next = curr.next) {
            curr.next = next.next;
            pre.next = next;
            next.next = curr;
        }

        return dummy.next;
    }
}
