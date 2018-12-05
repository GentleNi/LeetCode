package com.leetcode.linkedlist;

import org.w3c.dom.NodeList;

import java.awt.*;

/**
 * Created by GentleNi
 * Date 2018/11/8.
 */
public class ListNodeUtil {

    public static void iterateList(ListNode first) {
        //Iterate the LinkedList
        ListNode p = first;
        while (p.next != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println(p.val);
    }

    public static ListNode init(int[] vals) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for (int i = 0; i < vals.length ;i++) {
            ListNode node = new ListNode(vals[i]);
            curr.next = node;
            curr = curr.next;
        }
        return head.next;
    }
}
