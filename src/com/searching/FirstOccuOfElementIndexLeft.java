package com.searching;

public class FirstOccuOfElementIndexLeft {
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,2,2,2,2,2,2,3,3,4,4,4};
		int target=3;
		int left=0;
		int right=arr.length-1;
		int result=-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				result=mid;
				right=mid-1;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		System.out.println("First Occurance of Target Element Index From Left : "+result);
	}
}
