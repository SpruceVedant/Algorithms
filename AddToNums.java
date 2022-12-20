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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                // Initialize a new linked list to store the result
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int carry = 0;
        
        // Iterate over both linked lists as long as they have nodes
        while (l1 != null || l2 != null) {
            // Get the values of the current nodes in the linked lists
            // If a linked list has no more nodes, use 0 as the value
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            // Add the values and the carry from the previous iteration
            int s = x + y + carry;
            
            // Update the carry for the next iteration
            carry = s / 10;
            
            // Append the last digit of the sum to the result linked list
            curr.next = new ListNode(s % 10);
            curr = curr.next;
            
            // Move to the next nodes in the linked lists
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        
        // If there is a carry left, append it to the result linked list
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        
        // Return the result linked list, starting from the second node
        // (the first node was only used as a placeholder)
        return result.next;
    }
}
