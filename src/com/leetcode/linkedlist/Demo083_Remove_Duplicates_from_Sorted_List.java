package com.leetcode.linkedlist;

/**
 * Created by GentleNi
 * Date 2018/11/27.
 */
public class Demo083_Remove_Duplicates_from_Sorted_List {
    public static void main(String[] args) {

    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        for (ListNode prev = head, cur = head.next; cur != null; cur = prev.next) {
            if (prev.val == cur.val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
        }
        return head;
    }
}
