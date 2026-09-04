package com.basicsprograms;

public class DeleteInArray {

	public static void main(String[] args) {
	int arr[]= {12,89,36,48,39};
	int pos=3;
	//new Array
	int newArray[]=new int[arr.length-1];
	for(int i=0;i<pos;i++) {
	newArray[i]=arr[i];
	}
	//remaining values -new Array
	for(int i=pos;i<newArray.length;i++) {
		newArray[i]=arr[i+1];
	}
	System.out.println("After deleting specific position ");
	for(int i=0;i<newArray.length;i++) {
		System.out.print(newArray[i]+" ");
	}
	}

}
