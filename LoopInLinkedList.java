// Detect Loop in linked list -> problem: "https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1"

// You are given the head of a singly linked list. You have to determine whether the given linked list contains a loop or not. A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.

// Note: Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. If pos = 0, it means the last node points to null. Note that pos is not passed as a parameter.

// Examples:

// Input: pos = 2,
// Output: true
// Explanation: There exists a loop as last node is connected back to the second node.

// Input: pos = 0,
// Output: false
// Explanation: There exists no loop in given linked list.

// Input: pos = 1,
// Output: true
// Explanation: There exists a loop as last node is connected back to the first node.

// Constraints:
// 1 ≤ number of nodes ≤ 105
// 1 ≤ node->data ≤ 103       
// 0 ≤ pos ≤ number of nodes


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LoopInLinkedList {

    // Function to detect loop using Floyd’s Cycle Detection Algorithm
    public boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;          // move slow pointer 1 step
            fast = fast.next.next;     // move fast pointer 2 steps

            if (slow == fast) {
                return true;           // loop detected
            }
        }
        return false;                  // no loop
    }

    public static void main(String[] args) {
        LoopInLinkedList list = new LoopInLinkedList();

        // Create nodes
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create a loop for testing (5 → points back to 3)
        head.next.next.next.next.next = head.next.next;

        // Check for loop
        if (list.detectLoop(head)) {
            System.out.println("Loop detected in LinkedList");
        } else {
            System.out.println("No Loop in LinkedList");
        }
    }
}
