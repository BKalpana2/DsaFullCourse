package com.linkedlist;
import java.util.LinkedList;

public class SumOfElements {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int sum = 0;

        for (int num : list) {
            sum = sum + num;
        }

        System.out.println("Linked List: " + list);
        System.out.println("Sum of Elements: " + sum);
    }
}