package com.searching;

public class UnsortedArrayUsingBS {
	public static void main(String[] args) {
		int arr[]= {20,50,70,80,10,30,60};
		int left=0;
		int right=arr.length-1;
		int target=20;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
				i=-1;
			}
		}
		for(int i:arr) {
			System.out.println(i);
		}
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				System.out.println("Element FOund : "+mid);
				return;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
	}
}
