package com.basicsprograms;

public class MaximumElement {

	public static void main(String[] args) {
	int arr[]= {2,4,6,8,12};
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("Maximum element in the array : "+max);

	}

}
