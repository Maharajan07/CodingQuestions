// Middle of a Linked List  ->  Problem: "https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1"

// You are given the head of a linked list, You have to return the value of the middle node of the linked list.

// If the number of nodes is odd, return the middle node value.
// If the number of nodes is even, there are two middle nodes, so return the second middle node value.

// Examples:
// Input: LinkedList: 1->2->3->4->5  
// Output: 3  
// Explanation: Middle element is 3.

// Input: LinkedList: 1->2->3->4->5->6  
// Output: 4  
// Explanation: Since, there are even nodes, so there would be two middle nodes 3 and 4. 
// We need to print the second one, so 4.


// Constraints:
// 1 ≤ no. of nodes ≤ 105
// 1 ≤ node->data ≤ 105

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Solution {
    int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}

public class MiddleOfLinkedlist {
    public static void main(String[] args) {
        // Creating sample linked list: 1->2->3->4->5->6
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Solution sol = new Solution();
        int middle = sol.getMiddle(head);

        System.out.println("Middle of Linked List: " + middle);
    }
}