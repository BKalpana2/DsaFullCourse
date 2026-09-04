package com.basicsprograms;

public class RotateArrayRight {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		System.out.println(arr.length);
		System.out.println(arr.length-1);
		System.out.println("Before Rotate : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		for(int k=1;k<=2;k++) {
			int first=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=first;
		}
		System.out.println("\nRight rotate : ");
		for(int x:arr) {
			System.out.print(x+" ");
		}

	}

}
