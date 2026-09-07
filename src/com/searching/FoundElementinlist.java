package com.searching;

import java.util.Arrays;
import java.util.List;

public class FoundElementinlist {
public static void main(String[] args) {
	List<String> al= Arrays.asList("pen","paper","book","pencil");
	String target="book";
	for(String s:al) {
		if(s==target) {
			System.out.println("String Found : "+s);
			return;
		}
	}
	System.out.println("String is not found in the list");
}
}
