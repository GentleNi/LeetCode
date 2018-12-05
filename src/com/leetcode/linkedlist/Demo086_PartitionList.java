package com.leetcode.linkedlist;

/**
 * Created by GentleNi
 * Date 2018/11/26.
 */
public class Demo086_PartitionList {
    public static void main(String[] args) {
        int[] a = new int[]{1,4,3,2,5,2};
        ListNode l1 = ListNodeUtil.init(a);
        ListNode listNode = partition(l1, 3);
        ListNodeUtil.iterateList(listNode);
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode left_dummy = new ListNode(-1); // 头结点
        ListNode right_dummy = new ListNode(-1); // 头结点

        ListNode left_cur = left_dummy;//左链表当前位置
        ListNode right_cur = right_dummy;//右链表当前位置

        for (ListNode cur = head; cur != null; cur = cur.next) {
            if (cur.val < x) {
                left_cur.next = cur;
                left_cur = cur;
            } else {
                right_cur.next = cur;
                right_cur = cur;
            }
        }

        left_cur.next = right_dummy.next;//拼接
        right_cur.next = null;

        return left_dummy.next;
    }
}
