package com.linkedlist;
import java.util.LinkedList;

public class LargestElement {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(25);
        list.add(10);
        list.add(75);
        list.add(40);
        list.add(60);

        int max = list.get(0);

        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Linked List: " + list);
        System.out.println("Largest Element: " + max);
    }
}