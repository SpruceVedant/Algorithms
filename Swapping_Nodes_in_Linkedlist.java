// You are given the head of a linked list, and an integer k.

// Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        // Step 1: Traverse the list to find the kth node from the beginning
    ListNode node1 = head;
    for (int i = 1; i < k; i++) {
        node1 = node1.next;
    }

    // Step 2: Traverse the list again to find the kth node from the end
    ListNode node2 = head;
    ListNode curr = head;
    for (int i = 1; i <= k; i++) {
        curr = curr.next;
    }
    while (curr != null) {
        curr = curr.next;
        node2 = node2.next;
    }

    // Step 3: Swap the values of the two nodes
    int temp = node1.val;
    node1.val = node2.val;
    node2.val = temp;

    return head;
    }
}
