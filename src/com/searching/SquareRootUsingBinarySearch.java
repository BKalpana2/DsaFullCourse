package com.searching;

public class SquareRootUsingBinarySearch {
	public static void main(String[] args) {
		int n=625;
		int left=0;
		int right=n;
		int result=-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(mid*mid==n) {
				System.out.println("Square root : " + n +" -> "+mid);
				return;
			}
			else if(mid*mid<n) {
				result=mid;
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		System.out.print("Square root : " + n +" -> ");
		System.out.println(result);
	}
}
