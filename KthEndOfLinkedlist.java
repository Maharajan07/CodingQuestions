/* Kth from End of Linked List -> Problem: "https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1"

You are given the head of a linked list and the number k, You have to return the kth node from the end of linkedList. If k is more than the number of nodes, then the return -1.

Examples

Input: LinkedList: 1->2->3->4->5->6->7->8->9, k = 2
Output: 8
Explanation: The given linked list is 1->2->3->4->5->6->7->8->9. The 2nd node from end is 8.

Input: LinkedList: 10->5->100->5, k = 5
Output: -1
Explanation: The given linked list is 10->5->100->5. Since 'k' is more than the number of nodes, the output is -1.

Constraints:
1 ≤ number of nodes ≤ 106
1 ≤ node->data , x ≤ 106
1 ≤ k ≤ 106 */


class Solution {

    int getKthFromLast(Node head, int k) {
        
        Node p, x;
        p = head;
        x = head;
        
        for (int i=0; i<k; i++) {
            if (x == null) return -1;
            x = x.next;
        }
        
        while(x!= null) {
            p = p.next;
            x = x.next;
        }
        return p.data;
    }
}