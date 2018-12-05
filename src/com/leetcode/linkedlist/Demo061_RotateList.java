package com.leetcode.linkedlist;

import org.w3c.dom.NodeList;

/**
 * Created by GentleNi
 * Date 2018/12/3.
 */
public class Demo061_RotateList {

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

        ListNode newHead = rotateRight(node1,2);

        ListNodeUtil.iterateList(newHead);
    }
    public static ListNode rotateRight(ListNode head, int k) {

        int length = 1;//是1不是0
        ListNode p = head;
        //calculate the length of the list
        while (p.next != null) {
            length++;
            p = p.next;
        }
        k = length - (k % length);
        //circle the list
        p.next = head;
        for (int i = 0; i < k; i++) {
            p = p.next;
        }
        head = p.next;
        p.next = null;
        return head;
    }
}
