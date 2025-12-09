public class reverseOfDLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node reverseDoublyLinkedList(Node head) {
        Node current = head;
        Node temp = null;

        while (current != null) {
            // Swap next and prev pointers
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to the next node in the original list
            current = current.prev;
        }

        // After the loop, temp will be at the new head
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
public static void main(String[] args) {
        // Create a sample doubly linked list: 1 <-> 2 <-> 3 <-> 4 <-> 5
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;

        System.out.println("Original Doubly Linked List:");
        printList(head);

        head = reverseDoublyLinkedList(head);

        System.out.println("Reversed Doubly Linked List:");
        printList(head);
    }
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
