package com.searching;

public class InsertionPosition {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int left=0;
		int right=arr.length-1;
		int target=6;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				System.out.println(mid);
			return;
			}
			else if(arr[mid]>target) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		System.out.println("Position of insertion element :"+left);
	}
}

















