package com.basicsprograms;

public class RotatateArrayLeft {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		System.out.println("Before Rotating : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int k=1;k<=2;k++) {
			int first=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first;
		}
		System.out.println("\nAfter Rotating : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
