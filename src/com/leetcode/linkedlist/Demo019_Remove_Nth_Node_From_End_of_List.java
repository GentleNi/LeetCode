package com.leetcode.linkedlist;

/**
 * Created by GentleNi
 * Date 2018/12/5.
 */
public class Demo019_Remove_Nth_Node_From_End_of_List {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy,q = dummy;
        //q go n step first
        for (int i = 0; i < n; i++) {
            q = q.next;
        }

        while (q != null) {
            q = q.next;
            p = p.next;
        }

        p.next = p.next.next;
        return dummy.next;
    }
}
