package com.basicsprograms;

public class MissingElement {
public static void main(String[] args) {
	int arr[]= {1,2,3,5};
	int sum=0;
	int s=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	for(int i=1;i<=5;i++) {
		s+=i;
	}
	int ans=s-sum;
	System.out.println("Missing element : "+ans);
}
}
