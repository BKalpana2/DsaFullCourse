package com.basicsprograms;

public class UpdateInArray {
public static void main(String[] args) {
	int arr[]= {10,20,30,40};
	System.out.print("Before updating : ");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	int pos=2;
	int update=50;
	int newArr[]=new int[arr.length];
	for(int i=0;i<pos;i++) {
		newArr[i]=arr[i];
	}
	for(int i=pos;i<newArr.length;i++) {
		if(i==2)
		newArr[i]=update;
		else
			newArr[i]=arr[i];
	}
	System.out.print("After updating : ");
	for(int i=0;i<newArr.length;i++) {
		System.out.print(newArr[i]+" ");
	}
	
}
}
