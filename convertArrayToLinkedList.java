public class convertArrayToLinkedList {
    class Node {
        int val;
        Node next;
        Node(int x) { val = x; next = null; }
    }
    public Node arrayToLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        convertArrayToLinkedList converter = new convertArrayToLinkedList();
        int[] arr = {1, 2, 3, 4, 5};
        Node head = converter.arrayToLinkedList(arr);
        
        // Print the linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
