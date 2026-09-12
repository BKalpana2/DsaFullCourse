package com.twopointers;

public class ReverseArray {
	public static void reverse(int arr[]) {
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.print("After  Reverse : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String [] args) {
		int arr[]= {1,2,3,4,5};
		System.out.print("Before Reverse : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		reverse(arr);
	}
}
