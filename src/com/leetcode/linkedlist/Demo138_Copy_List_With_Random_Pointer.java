package com.leetcode.linkedlist;

import java.util.HashMap;

/**
 * Created by GentleNi
 * Date 2018/12/6.
 */
public class Demo138_Copy_List_With_Random_Pointer {
    class RandomListNode {
        int label;
        RandomListNode next, random;
        RandomListNode(int x) { this.label = x; }
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();

        RandomListNode cur = head;
        while(cur!= null){
            map.put(cur, new RandomListNode(cur.label));
            cur = cur.next;
        }

        cur = head;
        while(cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);

    }

    //Solution 2 把新节点一个一个插入到旧结点
    //比如 1-2-3-4  -> 1-1-2-2-3-3-4-4 然后再操作新生成的链表，再分割
//    public RandomListNode copyRandomList(RandomListNode head) {
//        for (RandomListNode cur = head; cur != null; ) {
//            RandomListNode node = new RandomListNode(cur.label);
//            node.next = cur.next;
//            cur.next = node;
//            cur = node.next;
//        }
//
//        for (RandomListNode cur = head; cur != null; ) {
//            if (cur.random != null)
//                cur.next.random = cur.random.next;
//            cur = cur.next.next;
//        }
//
//        // 分拆两个单链表
//        RandomListNode dummy = new RandomListNode(-1);
//        for (RandomListNode cur = head, new_cur = dummy;
//             cur != null; ) {
//            new_cur.next = cur.next;
//            new_cur = new_cur.next;
//            cur.next = cur.next.next;
//            cur = cur.next;
//        }
//        return dummy.next;
//    }
}

