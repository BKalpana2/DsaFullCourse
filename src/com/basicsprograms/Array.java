package com.basicsprograms;

public class Array {

	public static void main(String[] args) {
		//declaration
//		int []arr1;
		System.out.println("Array declared..");
		//initilisation
		int arr2[]=new int[5];
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		//direct initilisation
		int arr3[]= {1,2,3,4,5};
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		//indexing
		int arr4[]= {12,89,46,56};
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println(arr4[3]);
		System.out.println(arr4[4]);
		//Traversing -index,value
		int arr5[]= {34,22,333,44};
		for(int i=0;i<arr5.length;i++) {
			System.out.println("index : "+i+"value : "+arr5[i]);
		}
	}

}
