package com.basicsprograms;

public class Intersectionof2Arrays {

	public static void main(String[] args) {
		int arr1[]= {1,2,2,4,6};
		int arr2[]= {2,2,3,4};
		System.out.print("Intersection of two arrays : ");
		for(int i=0;i<arr1.length;i++) {
			boolean printed=false;
			for(int k=0;k<i;k++) {
				if(arr1[k]==arr1[i]) {
					printed=true;
					break;

				}
			}
			if(printed)
				continue;

			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
					break;
				}
			}

		}
	}

}
