package com.leetcode.linkedlist;

import sun.misc.PostVMInitHook;

/**
 * Created by GentleNi
 * Date 2018/11/7.
 */
public class Demo328_OddEvenLinkedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        ListNodeUtil.iterateList(node1);
        ListNode node = oddEvenList(node1);
        ListNodeUtil.iterateList(node);
    }

    //solution1：遍历一遍，两个子链表最后合并
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode oddHead = new ListNode(0);//相当于无数据的头指针
        ListNode evenHead = new ListNode(0);
        ListNode odd = oddHead;
        ListNode even = evenHead;
        ListNode curr = head;
        int index = 1;
        while (curr != null) {
            if (index % 2 == 1) {
                odd.next = curr;
                odd = odd.next;
            } else {
                even.next = curr;
                even = even.next;
            }
            //每次都把奇数或者偶数的的最后设置成NULL，防止出现 1 4 5 6，最后退出循环但是5和6之间的
            //联系没有断开的形况
            ListNode tmp = curr.next;
            curr.next = null;
            curr = tmp;
            index++;
        }
        odd.next = evenHead.next;
        return head;
    }
}
