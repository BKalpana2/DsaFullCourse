package com.linkedlist;

public class InsertCase {

    // Print from beginning
    public void printFromBeg(DoubleListNode node) {
        if (node == null) {
            System.out.println("List is empty");
            return;
        }

        // Move backward until reaching the first node
        while (node.prev != null) {
            node = node.prev;
        }

        // Print from beginning to end
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }

        System.out.println("null");
    }

    // Print from end
    public void printFromEnd(DoubleListNode node) {
        if (node == null) {
            System.out.println("List is empty");
            return;
        }

        // Move forward until reaching the last node
        while (node.next != null) {
            node = node.next;
        }

        // Print from end to beginning
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.prev;
        }

        System.out.println("null");
    }

    // Insert at beginning
    public DoubleListNode insertAtBeg(DoubleListNode node, int valToInsert) {
        DoubleListNode newNode = new DoubleListNode(valToInsert);

        if (node == null) {
            return newNode;
        }

        // Find the first node
        while (node.prev != null) {
            node = node.prev;
        }

        // Connect the new node
        newNode.next = node;
        node.prev = newNode;

        return newNode;
    }

    // Insert at end
    public DoubleListNode insertAtEnd(DoubleListNode node, int valToInsert) {
        DoubleListNode newNode = new DoubleListNode(valToInsert);

        if (node == null) {
            return newNode;
        }

        // Find the last node
        while (node.next != null) {
            node = node.next;
        }

        // Connect the new node
        node.next = newNode;
        newNode.prev = node;

        // Return the original first node
        while (node.prev != null) {
            node = node.prev;
        }

        return node;
    }

    // Insert at a specified position (1-based indexing)
    public DoubleListNode insertAtPos(
            DoubleListNode node, int pos, int valToInsert) {

        if (pos < 1) {
            throw new IllegalArgumentException(
                    "Position must be greater than or equal to 1");
        }

        if (pos == 1) {
            return insertAtBeg(node, valToInsert);
        }

        if (node == null) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        // Find the first node
        while (node.prev != null) {
            node = node.prev;
        }

        // Move to the node before the insertion position
        for (int i = 1; i < pos - 1; i++) {
            if (node.next == null) {
                throw new IndexOutOfBoundsException("Invalid position");
            }
            node = node.next;
        }

        DoubleListNode newNode = new DoubleListNode(valToInsert);

        // Connect the new node
        newNode.next = node.next;
        newNode.prev = node;

        if (node.next != null) {
            node.next.prev = newNode;
        }

        node.next = newNode;

        return getFirstNode(node);
    }

    // Helper method to find the first node
    private DoubleListNode getFirstNode(DoubleListNode node) {
        while (node.prev != null) {
            node = node.prev;
        }
        return node;
    }

    public static void main(String[] args) {

        DoubleListNode l1 = new DoubleListNode(1);
        DoubleListNode l2 = new DoubleListNode(2);
        DoubleListNode l3 = new DoubleListNode(3);
        DoubleListNode l4 = new DoubleListNode(4);

        // Connect the nodes
        l1.next = l2;
        l2.prev = l1;

        l2.next = l3;
        l3.prev = l2;

        l3.next = l4;
        l4.prev = l3;

        InsertCase ic = new InsertCase();

        System.out.println("Original list:");
        ic.printFromBeg(l2);

        System.out.println("Print from end:");
        ic.printFromEnd(l3);

        // Insert at beginning
        l1 = ic.insertAtBeg(l3, 67);
        System.out.println("After inserting 67 at beginning:");
        ic.printFromBeg(l1);

        // Insert at end
        l1 = ic.insertAtEnd(l1, 77);
        System.out.println("After inserting 77 at end:");
        ic.printFromBeg(l1);

        // Insert at position 3
        l1 = ic.insertAtPos(l1, 3, 99);
        System.out.println("After inserting 99 at position 3:");
        ic.printFromBeg(l1);
    }
}