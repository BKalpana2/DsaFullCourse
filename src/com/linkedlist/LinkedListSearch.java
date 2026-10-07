package com.linkedlist;

class Nodes {
    int data;
    Node next;

    Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListSearch {

    Node head;

    void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void search(int value) {

        Node temp = head;
        int position = 1;

        while (temp != null) {

            if (temp.data == value) {
                System.out.println(value + " found at position " + position);
                return;
            }

            temp = temp.next;
            position++;
        }

        System.out.println(value + " not found");
    }

    public static void main(String[] args) {

        LinkedListSearch list = new LinkedListSearch();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.search(30);
        list.search(100);
    }
}
