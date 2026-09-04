package com.basicsprograms;

public class AverageArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	double average=0;
	double sum=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	average=sum/arr.length;
	System.out.println("Average : "+average);
}
}
