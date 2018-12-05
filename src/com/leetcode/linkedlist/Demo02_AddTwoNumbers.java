package com.leetcode.linkedlist;

import java.time.temporal.ValueRange;
import java.util.Arrays;

/**
 * Created by GentleNi
 * Date 2018/11/8.
 */
public class Demo02_AddTwoNumbers {
    public static void main(String[] args) {
        int[] a = new int[]{2,4,3};
        int[] b = new int[]{5,6,4};
        ListNode l1 = ListNodeUtil.init(a);
        ListNode l2 = ListNodeUtil.init(b);
        ListNode listNode = addTwoNumbers(l1, l2);
        ListNodeUtil.iterateList(listNode);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode nextVal = head;
        ListNode p1;
        ListNode p2;
        int lastFlow = 0;
        for (p1 = l1, p2 = l2;
             p1 != null || p2 != null;
             p1 = p1 == null ? null : p1.next,p2 = p2 == null ? null : p2.next,nextVal = nextVal.next) {
            int val1 = p1 == null ? 0 : p1.val;
            int val2 = p2 == null ? 0 : p2.val;
            int rest = (val1 + val2 + lastFlow) % 10;
            lastFlow = (val1 + val2) / 10;
            nextVal.next = new ListNode(rest);
        }
        return head.next;
    }
}
