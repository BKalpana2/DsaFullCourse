package com.searching;

public class FirstEvenNumber {
	public static void main(String[] args) {
		int arr[]= {3,7,11,7,43,12};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("First Even number : "+arr[i]);
				return;
			}
		}
		System.out.println("no element found");
		
	}
}
