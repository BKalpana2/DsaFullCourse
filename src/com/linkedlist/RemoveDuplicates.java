package com.linkedlist;
import java.util.LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(30);

        System.out.println("Original List: " + list);

        LinkedList<Integer> uniqueList = new LinkedList<>();

        for (int num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        System.out.println("List After Removing Duplicates: " + uniqueList);
    }
}