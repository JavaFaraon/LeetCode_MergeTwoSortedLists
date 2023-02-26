package org.example;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {

//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1 == null)
//        {System.out.println("Step1");
//            return list2;}
//        if (list2 == null)
//        {System.out.println("Step2");
//            return list1;}
//
//        if (list1.val < list2.val) {
//            list1.next = mergeTwoLists(list1.next, list2);
//            return list1;
//        }
//        else {
//            list2.next = mergeTwoLists(list1, list2.next);
//            return list2;
//        }
//    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;

        while (list1 != null && list2 != null) {
        if (list1.val < list2.val) {
            tail.next = list1;
            list1 = list1.next;
        } else {
            tail.next = list2;
            list2 = list2.next;
        }
        tail = tail.next;
    }

        if (list1 != null) {
        tail.next = list1;
    } else {
        tail.next = list2;
    }

        return dummy.next;
    }
}
