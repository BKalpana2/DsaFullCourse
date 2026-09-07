package com.searching;

public class FindStringUsingBinarySearch {
	public static void main(String[] args) {
		String str[]= {"Apple","Bat","Cat","Dog","Egg"};
		int left=0;
		int right=str.length-1;
		String target="Cat";
		while(left<=right) {
			int mid=(left+right)/2;
			if(str[mid].equals(target)) {
				System.out.println("String found : "+mid);
			return;
			}
			else if(str[mid].compareTo(target)<0) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
	}
}
