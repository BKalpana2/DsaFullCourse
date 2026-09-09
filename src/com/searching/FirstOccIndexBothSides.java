package com.searching;

public class FirstOccIndexBothSides {
	public static void main(String[] args) {
		int arr[]= {1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5};
		int left1=0;
		int right1=arr.length-1;
		int left2=0;
		int right2=arr.length-1;
		int result1=-1;
		int result2=-1;
		int target=4;
		while(left1<=right1||left2<=right2) {
			int mid1=(left1+right1)/2;
			if(arr[mid1]==target) {
				result1=mid1;
				right1=mid1-1;
			}else if(arr[mid1]<target){
				left1=mid1+1;
			}else {
				right1=mid1-1;
			}
			int mid=(left2+right2)/2;
			if(arr[mid]==target) {
				result2=mid;
				left2=mid+1;
			}else if(arr[mid]<target){
				left2=mid+1;
			}else {
				right2=mid-1;
			}
		}
		System.out.println("Index of First Occurance element From bothsides : "+result1+" "+result2);
	}
}
