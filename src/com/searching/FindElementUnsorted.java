package com.searching;

public class FindElementUnsorted {
	public static void main(String[] args) {
		int arr[]= {23,19,18,32,44};
		int target=44;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		System.out.println(index!=-1?"found at index : "+index :"not found");
	}
}
