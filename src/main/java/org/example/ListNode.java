package org.example;

public class ListNode {
    int val;
    ListNode next;
   ListNode(int val) { this.val = val; this.next = null; }
   public void add(int val) {
       ListNode newNode = new ListNode(val);
       ListNode current = this;
       while (current.next != null) {
           current = current.next;
       }
       current.next = newNode;
   }

    public void printList() {
        ListNode current = this;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
