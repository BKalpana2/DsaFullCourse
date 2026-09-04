package com.basicsprograms;

public class InsertinArray {

	public static void main(String[] args) {
		int arr[]= {12,14,16,18,};
		int pos=2;
		int value=25;
		int newArray[]=new int[arr.length+1];
		//Inserting the values upto position 
		for(int i=0;i<pos;i++) {
			newArray[i]=arr[i];
		}
		newArray[pos]=value;
		//remaining values inserting into new Array
		for(int i=pos;i<arr.length;i++) {
			newArray[i+1]=arr[i];
		}
		//traversing the values
		for(int i=0;i<newArray.length;i++) {
			System.out.print(newArray[i]+" ");
		}
		

	}

}
