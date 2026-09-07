package com.searching;

public class FindElementSorted {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7,8,10};
		int target=5;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				found=true;
			}
			else if(target<arr[i]) {
				break;
			}
		}
		if(found) {
			System.out.println("Found Element ");
		}else {
			System.out.println("No element");
		}
	}
}
