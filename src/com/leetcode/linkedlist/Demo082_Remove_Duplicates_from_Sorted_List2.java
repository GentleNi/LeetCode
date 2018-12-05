package com.leetcode.linkedlist;

/**
 * Created by GentleNi
 * Date 2018/11/27.
 */
public class Demo082_Remove_Duplicates_from_Sorted_List2 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr!=null) {
            boolean duplicate = false;

            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
                duplicate = true;//此次循环发现有重复的
            }

            if (duplicate) {
                curr = curr.next;
                continue;
            }

            prev.next = curr;
            prev = curr;
            curr = curr.next;

        }
        prev.next = curr;
        return dummy.next;

    }
}
