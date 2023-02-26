package org.example;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        Solution solution = new Solution();
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1);

        list1.add(2);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);

        list1.printList();
        list2.printList();

        ListNode mergedList = solution.mergeTwoLists(list1, list2);
        System.out.println("Result: ");
        mergedList.printList();
    }
}