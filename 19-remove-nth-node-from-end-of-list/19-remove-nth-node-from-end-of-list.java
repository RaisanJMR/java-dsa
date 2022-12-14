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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // IF LIST WITH 1 ELEMENT
        if (head.next == null)
            return null;

        // FINDING THE LENGTH OF LIST.
        int length = getLen(head);
        // LENGTH - N -1 TIMES WE WILL MOVE STORING IT IN H.
        int h = length - n;

        // CREATING TEMPORARY NODE TEMP
        ListNode temp = head;

        // IF WE HAVE TO REMOVE A HEAD
        if (length == n) {
            head = head.next;
            return head;
        }
        // NOW MOVE TEMP FOR H-1 TIMES
        for (int i = 0; i < h - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        // CHECK FOR NULL POINTER EXCEPTION
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        // FINALLY RETURN THE HEAD.
        return head;
    }

    // FUNCTION TO FIND THE LENGTH OF LINKED LIST
    public int getLen(ListNode head) {
        ListNode temp = head;
        int x = 0;
        while (temp != null) {
            temp = temp.next;
            x++;
        }
        return x;
    }
}