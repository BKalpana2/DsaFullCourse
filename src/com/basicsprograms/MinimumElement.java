package com.basicsprograms;

public class MinimumElement {
public static void main(String[] args) {
	int arr[]= {10,6,8,2,1};
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	System.out.println("Minimum element in the array : "+min);
}
}
