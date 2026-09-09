package com.searching;

public class FindStringUsingBinarySearch {
	public static void main(String[] args) {
		String str[]= {"babu","cartoon","deathrace","wrongturn"};
		int left=0;
		int right=str.length-1;
		String target="wrongturn";
		while(left<=right) {
			int mid=(left+right)/2;
			int cmp=str[mid].compareTo(target);
			if(cmp==0) {
				System.out.println("String found : "+mid);
			return;
			}
			else if(cmp>0) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
	}
}
