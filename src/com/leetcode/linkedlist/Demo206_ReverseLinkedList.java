package com.leetcode.linkedlist;

import org.w3c.dom.NodeList;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * Created by GentleNi
 * Date 2018/11/6.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Demo206_ReverseLinkedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        ListNodeUtil.iterateList(node1);

        //reverse the list
//        ListNode newHead = reverseList(node1);
//
//        iterateList(newHead);

        //reverse the list
        ListNode newHead = reverseList2(node1);

        ListNodeUtil.iterateList(newHead);

    }

    //solution1 ：直接一个一个反转
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode p = head;
        ListNode q = head.next;
        head.next = null;

        while (q != null) {
            ListNode r = q.next;
            q.next = p;
            p = q;
            q = r;
        }
        return p;
    }

    //solution2 : 2-N个节点都跟在head后，最后再把head放到末尾
    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode p = head.next;
        ListNode q = p.next;
        while (q != null) {
            p.next = q.next;
            q.next = head.next;
            head.next = q;
            q = p.next;
        }
        ListNode first = head.next;
        head.next = null;
        p.next = head;
        return first;
    }


}
