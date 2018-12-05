package com.leetcode.linkedlist;

/**
 * Created by GentleNi
 * Date 2018/11/15.
 */
public class Demo092_ReverseLinkedList2 {

    //用头插法
    public static ListNode reverseLinkedList(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode mHead = head;//mHead为指向m-1位置的指针，即为头插法的头
        ListNode indexHead;
        int index =1;
        if (m == 1) {
            mHead = dummy;
        } else {
            while (index < m -1) {//指针指到m的前一个位置
                mHead = mHead.next;
                index++;
            }
        }

        indexHead = mHead.next;//指向第m个节点，即为第一个要头插的节点
        ListNode curr = indexHead.next;//
        for (int i = m; i < n; i++) {
            indexHead.next = curr.next;
            curr.next = mHead.next;
            mHead.next = curr;
            curr = indexHead.next;
            index++;
        }

        return dummy.next;
    }

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

        ListNode newHead = reverseLinkedList(node1,1,3);

        ListNodeUtil.iterateList(newHead);

    }

}
