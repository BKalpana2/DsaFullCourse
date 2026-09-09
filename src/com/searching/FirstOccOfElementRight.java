package com.searching;

public class FirstOccOfElementRight {
	public static void main(String[] args) {
		int arr[]= {1,1,1,1,2,2,2,3,4,5,5,6,6,6,6,6,6};
		int left=0;
		int right=arr.length-1;
		int result=-1;
		int target=2;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				result=mid;
				left=mid+1;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		System.out.println("First occurance of target element from right side : "+result);
	}
}
