package com.twopointers;

public class RemoveDuplicates {
	public static void remove(int arr[]) {
		int slow=0;
		int index=0;
		int cnt=0;
		for(int fast=0;fast<arr.length;fast++) {
			if(arr[fast]==arr[slow]) {
			arr[index++]=arr[slow];
			cnt++;
			}
		}
		for(int i=0;i<cnt;i++) {
			arr[i]=arr[slow];
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,4};
		remove(arr);
	}
}
